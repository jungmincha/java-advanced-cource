package etc;

public enum PcStatus {
    PC1010_00("대기중"),
    PC1010_10("진행"),
    PC1010_80("완료");

    private final String value;

    PcStatus(String value) {
         this.value = value;
    }

    public String getValue(){
        
        return value;
    }

}

class Practic {
    public static void main(String[] args) {
        System.out.println(PcStatus.PC1010_00.getValue());
        System.out.println(PcStatus.PC1010_10.getValue());
    }

}
