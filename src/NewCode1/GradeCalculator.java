package NewCode1;

public class GradeCalculator {
	 public static int[] computeMarks(int[][] studentData) {


	        int[] moduleMarks = new int[6];
	        int computedModuleMark = 0;

	        

	        for (int x = 0; x < studentData.length; x++) {

	            int weighting = studentData[x][0];
	            int coursework = studentData[x][1];
	            int exam = studentData[x][2];

	            
	            computedModuleMark = (int) ((((coursework * weighting) + (exam * (100 - weighting))) + 0.5) / 100);

	            

	            if (exam >= 35 && coursework >= 35) {
	                moduleMarks[x] = computedModuleMark;

	            } else if (exam < 35 || coursework < 35) {
	                moduleMarks[x] = Math.min(35, computedModuleMark);
	            }
	        }

	        // DEBUG : DISPLAY ALL MODULE MARKS
	        // for(int p: moduleMarks){ System.out.println(p); }

	        return moduleMarks;

	    }


	    public static String computeResult(int[] moduleMarks) {

	        // Initialise variables representing each attainable result

	        int pass = 0;
	        int compensatableFail = 0;
	        int fail = 0;

	        // Initialise variable (0) - Storing total marks achieved by way of compensatableFails

	        int compensatableFailTotal = 0;

	        // Determine status of each module result and increment the appropriate result

	        for (int mark : moduleMarks) {

	            if (mark >= 40) {
	                pass += 1;

	            } else if (mark < 40 && mark >= 35) {
	                compensatableFail += 1;

	                // Update total marks achieved by way of compensatable fail
	                compensatableFailTotal += mark;

	            } else {
	            	 fail += 1;
	            }

	        }
	        int stageTotal = 0;

	        for (int mark : moduleMarks) {
	            stageTotal += mark;
	        }

	        int stageAverage = stageTotal / moduleMarks.length;

	        

	        if (pass == 6) {
	            return "Pass";

	        } else if (stageAverage >= 40 && fail == 0 && compensatableFail <= 2 && compensatableFailTotal <= 40) {
	            return "Compensatable Pass";

	        } else {
	            return "Fail";
	        }

	    }
	            
}
