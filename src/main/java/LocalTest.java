import Classes.Review;
import Classes.ReviewsBatch;
import com.google.gson.Gson;

import java.io.*;
import java.util.List;

import static Classes.Resources.*;


public class LocalTest {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        SentimentAnalysis sa = new SentimentAnalysis();
        NamedEntityRecognition ner = new NamedEntityRecognition();

        File inputDir = new File("src/main/java/input_files");
        File[] inputFiles = inputDir.listFiles();

        StringBuilder bodyBuilder = new StringBuilder();

        for (File f : inputFiles) {
            try (FileReader reader = new FileReader(f)) {
                ReviewsBatch[] reviewsByTitleList = gson.fromJson(reader, ReviewsBatch[].class);
                for (ReviewsBatch reviewsBatch : reviewsByTitleList) {
                    String title = reviewsBatch.getTitle();
                    List<Review> reviews = reviewsBatch.getReviews();
                    for (Review review : reviews) {
                        long rating = review.getRating() ;
                        String text = review.getText();
                        int sentiment = sa.findSentiment(text);
                        String entities = ner.getEntities(text);
                        String suffix = String.format(htmlSuffixFormat, entities, (rating - 1 == sentiment)? sarcasm[1] : sarcasm[0]);
                        String prefix = String.format(htmlReviewText, colors[sentiment],text);
                        String row = prefix + suffix + "\n";
                        bodyBuilder.append(row);


                    }
                    System.out.println("Batch  process finished");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        String allBody = String.format(htmlBody, bodyBuilder.toString());
        String doc = String.format(htmlDoc, htmlHead+allBody);
        FileOutputStream fos = new FileOutputStream("outputs.html");
        fos.write(doc.getBytes());
    }

}
