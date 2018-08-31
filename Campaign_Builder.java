import javax.swing.JOptionPane;

public class Campaign_Builder {
    public static void main(String[] args) {
    	String[] choices = { "Create New Campaign", "Open Existing Campaign"};
    	String[] templates = { "Single Image Ad", "Multi Image Carousel Ad","Multi Image Slider Ad"};
    	
    	String input = (String) JOptionPane.showInputDialog(null, "Create new or open existing?",
        "Lets make a Campaign!", JOptionPane.QUESTION_MESSAGE, null, choices,choices[1]); 
    	
    	if(input == null){
    		System.exit(0);
    	}
    	
    	else if(input.equals("Create New Campaign")){
    		String in = (String) JOptionPane.showInputDialog(null, "Choose a Template",
        	"Lets make a Campaign!", JOptionPane.QUESTION_MESSAGE, null, templates,templates[0]);
        	if(in == null){
    			System.exit(0);
    		}
        	else if(in.equals(templates[0])){
        		createSingleImageAd();
        	}
        	else if(in.equals(templates[1])){
        		createMultiImageCarouselAd();
        	}
        	else if(in.equals(templates[2])){
        		createMultiImageSliderAd();
        	}
    	}
    	
    	else if(input.equals("Open Existing Campaign")){
    		System.out.println(input);
    	}
    }

    public static void createSingleImageAd(){

    }

    public static void createMultiImageCarouselAd(){
    	
    }

    public static void createMultiImageSliderAd(){
    	
    }

}