package CompositeDesignPattern;

public class CompositeDesignPatternMain {
    public static void main(String[] args) {
        File file1 = new File("Document.docx");
        File file2 = new File("Image.jpg");
        File file3 = new File("Video.mp4");

        // Create a directory and add files to it
        Directory docs = new Directory("Documents");
        docs.add(file1);
        docs.add(file2);

        // Create another directory and add both files and directories to it
        Directory root = new Directory("Root");
        root.add(docs);  // Add the documents directory to root
        root.add(file3);  // Add a video file to root

        // Display all details (directories and files)
        root.showDetails();
    }
}
