package rookie.rank;

/**
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close
 * attention to small details like topography. During his last hike, he took
 * exactly n steps. For every step he took, he noted if it was an uphill or a
 * downhill step. Gary's hikes start and end at sea level. We define the
 * following terms:
 * 
 * A mountain is a non-empty sequence of consecutive steps above sea level,
 * starting with a step up from sea level and ending with a step down to sea
 * level.
 * 
 * A valley is a non-empty sequence of consecutive steps below sea level,
 * starting with a step down from sea level and ending with a step up to sea
 * level. Given Gary's sequence of up and down steps during his last hike, find
 * and print the number of valleys he walked through.
 * 
 * If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

_/\      _
   \    /
    \/\/
 * It's clear that there is only one valley there, so we print  on a new line.
 * 
 * Passes all Hacker Rank test cases.
 * 
 * @author J.T. Earl
 *
 */
public class CountingValleys {

	public static void main(String[] args) {
		String steps = "UDDDUDUU";
		int level = 0;
		int count = 0;
		for (int i = 0; i < steps.length(); i++) {
			if (steps.charAt(i) == 'D')
				level--;
			if (steps.charAt(i) == 'U')
				level++;
			if (level == -1 && steps.charAt(i + 1) == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}
}
