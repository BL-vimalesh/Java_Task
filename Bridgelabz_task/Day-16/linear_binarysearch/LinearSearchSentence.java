package linear_binarysearch;

public class LinearSearchSentence {

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful language",
            "I am learning data structures",
            "Linear search is simple",
            "Searching is easy"
        };

        String wordToSearch = "data";
        wordToSearch.toLowerCase();
        
        for(int i=0;i<sentences.length;i++) {
        	if(sentences[i].contains(wordToSearch)) {
        		System.out.print(sentences[i]);
        	}
        }
    }
}
