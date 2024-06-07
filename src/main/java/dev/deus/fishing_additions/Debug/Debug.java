package dev.deus.fishing_additions.Debug;

public class Debug {
	private static final String RESET = "\033[0m";
	private static final String BLUE = "\033[34m";
	private static final String YELLOW = "\033[33m";
	private static final String CYAN = "\033[36m";

	public static void println(String x) {
		System.out.println(BLUE + "[Debug]" + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
		System.out.println(CYAN + x + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
	}

	public static void println(int x) {
		System.out.println(BLUE + "[Debug]" + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
		System.out.println(CYAN + x + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
	}

	public static void println(Boolean x) {
		System.out.println(BLUE + "[Debug]" + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
		System.out.println(CYAN + x + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
	}

	public static void println(float x) {
		System.out.println(BLUE + "[Debug]" + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
		System.out.println(CYAN + x + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
	}

	public static void println(double x) {
		System.out.println(BLUE + "[Debug]" + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
		System.out.println(CYAN + x + RESET);
		System.out.println(YELLOW + "----------------------------------------------------------" + RESET);
	}
}
