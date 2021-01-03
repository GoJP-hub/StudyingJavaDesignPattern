package designpattern.builder;

public class DirectorBuild {
	/****************************************
	 * Description--Create an construct with Builder (base template) as input
	 * @author gohir
	 *****************************************/
	private BuilderBase build;

	public DirectorBuild(BuilderBase build) {
		this.build = build;
	}

	/****************************************
	 * Description--Construct based on sets of methods defined by Builder
	 * @author gohir
	 *****************************************/
	public void construct() {
		build.makeTitle("Greetings");
		build.makeMessage("In the morning and in the afternoon");
		build.makePoints(new String[] {
				"Good morning",
				"Hello"
		});
		build.makeMessage("In the evening and in the night");
		build.makePoints(new String[] {
				"Good evening",
				"Good night"
		});
		build.close();
	}
}
