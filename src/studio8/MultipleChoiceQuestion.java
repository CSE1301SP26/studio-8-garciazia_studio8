package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;

	/**
	 * Constructor
	 * 
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;

		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		// throw new NotYetImplementedException();
	}

	/**
	 * Display the prompt for the question in addition to
	 * the choices present for the question.
	 */
	@Override
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < choices.length; i++) {
			System.out.println(i + 1 + ". " + choices[i]);

		}

		// throw new NotYetImplementedException();
	}

	/**
	 * Getter method for the available choices
	 * 
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
		// hrow new NotYetImplementedException();
	}

	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		String[] SkyColor = { "blue", "orange", "white", "brown" };

		MultipleChoiceQuestion Q2 = new MultipleChoiceQuestion("What color is the sky?", "blue", 4, SkyColor);
		Q2.displayPrompt();
	}
}
