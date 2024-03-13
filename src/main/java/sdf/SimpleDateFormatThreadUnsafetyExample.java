package sdf;

import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDateFormatThreadUnsafetyExample {
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public static void main(String[] args) {
		String dateStr = "2018-06-22T10:00:00";

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Runnable task = () -> parseDate(dateStr);

		for(int i = 0; i < 100; i++) {
			executorService.submit(task);
		}

		executorService.shutdown();
	}

	private static void parseDate(String dateStr) {
		try {
			String date = simpleDateFormat.format(dateStr);
			System.out.println("Successfully Parsed Date " + date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
