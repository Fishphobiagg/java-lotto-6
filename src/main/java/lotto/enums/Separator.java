package lotto.enums;

public enum Separator {

    EMPTY_SPACE(" "),
    COMMA(",");

    private String separator;

    Separator (String separator){
        this.separator = separator;
    }

    @Override
    public String toString(){
        return this.separator;
    }

}
