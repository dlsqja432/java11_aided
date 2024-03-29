package behavioral.visitor;

//Visitor Pattern : 데이터와 구조를 분리하여 구조를 수정하지 않고 새로운 기능을 추가할 수 있는 패턴
public class VisitorPattern {
	public static void main(String[] args) {
      Directory root = new Directory("root");
      Directory bin = new Directory("bin");
      Directory kkt = new Directory("kkt");
      File file1 = new File("file1");
      File file2 = new File("file2");
      File file3 = new File("file3");
      File file4 = new File("file4");

      root.add(file1);
      bin.add(file2);
      bin.add(file3);
      kkt.add(file4);
      root.add(kkt);
      root.add(bin);

      root.accept(new ViewVisitor());    //경로 출력
	}
}
