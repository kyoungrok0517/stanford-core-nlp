import edu.stanford.nlp.simple.*;

import java.util.List;

class Main {
    public static void main(String[] args) {
        Sentence sent = new Sentence("Lucy is in the sky with diamonds.");
        List<String> nerTags = sent.nerTags();  // [PERSON, O, O, O, O, O, O, O]
        String firstPOSTag = sent.posTag(0);   // NNP
    }
}
