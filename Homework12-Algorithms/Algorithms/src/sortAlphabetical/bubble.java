package sortAlphabetical;

public class bubble {
	
		public void bubbleSortString(String[] arrayText){
			for (int i = 0; i < arrayText.length; i++){
				for (int j = i + 1; j < arrayText.length; j++){
	            	
					if (arrayText[i].compareToIgnoreCase(arrayText[j])>0){
	            		
						String temp = arrayText[i];
	                    arrayText[i] = arrayText[j];
	                    arrayText[j] = temp;
	                }
	            }
	        }
		}
	}
	

