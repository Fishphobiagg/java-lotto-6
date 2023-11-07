package lotto.domain.lotto;

import java.util.ArrayList;
import java.util.List;

import lotto.domain.number.LottoNumber;

public class Lotto {

    private static final int LOTTO_NUMBERS_SIZE = 6;
    private List<LottoNumber> numbers = new ArrayList<>();

    public static Lotto forUserLotto(List<LottoNumber> lottoNumbers){
        return new Lotto(lottoNumbers);
    }

    public static Lotto raffle(List<LottoNumber> numbers){
        return new Lotto(numbers);
    }

    private Lotto(List<LottoNumber> numbers) {
        validateNumberSize(numbers);
        this.numbers.addAll(numbers);
    }

    private void validateNumberSize(List<LottoNumber> numbers) {
        if (numbers.size() != LOTTO_NUMBERS_SIZE) {
            throw new IllegalArgumentException();
        }
    }
    @Override
    public String toString(){
        return numbers.toString();
    }

}
