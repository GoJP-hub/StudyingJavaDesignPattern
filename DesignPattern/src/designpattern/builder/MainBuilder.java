package designpattern.builder;

public class MainBuilder {
	/****************************************
	 * Description--Comment the available options
	 * @author gohir
	 *****************************************/
	public static void usageGuide() {
		System.out.println("at commandline insert either option");
		System.out.println("Guide: java MainBuilder plain");
		System.out.println("Guide: java MainBuilder html");
	}
	public static void main(String[] args) {
		/****************************************
		 * Description--Create an instance for Client (Class that creates and use prototypes)
		 * @author gohir
		 *****************************************/
		if (args.length != 1) {
			usageGuide();
			System.exit(0);
		}
		/****************************************
		 * Description--Call relevant builders based on the command
		 * ①Create builder instance
		 * ②Create director instance by feeding the builder
		 * ③Use/construct the builder
		 * @author gohir
		 *****************************************/
		if(args[0].equals("plain")){
			BuilderText builderText = new BuilderText();
			DirectorBuild d1 = new DirectorBuild(builderText) ;
			d1.construct();
			String result1 = builderText.showResult();
			System.out.println(result1);
		}else if(args[0].equals("html")){
			BuilderHtml bulderHtml = new BuilderHtml();
			DirectorBuild d2 = new DirectorBuild(bulderHtml);
			d2.construct();
			String result2 = bulderHtml.showResult();
			System.out.println(result2 +"is created");
		}else {
			usageGuide();
			System.exit(0);
		}

	}
}
