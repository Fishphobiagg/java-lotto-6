package lotto.domain.user;

import camp.nextstep.edu.missionutils.Console;
import lotto.global.enums.ViewMessage;
import lotto.global.validator.UserViewValidator;

public class UserView {

    private final UserController userController;
    private final UserViewValidator userViewValidator;

    public UserView(UserController userController, UserViewValidator userViewValidator){
        this.userController = userController;
        this.userViewValidator = userViewValidator;
    }

    public void inputUserAssets(){
        System.out.println(ViewMessage.INPUT_MONEY_AMOUNT);
        User user = userController.createUserWithAssets(inputAssetWithValidate());
        outputBuyLotto(user);
    }

    private void outputBuyLotto(User user){
        UserLottoResponse response = userController.buyLotto(user);
        response.outputLottoSize();
        System.out.println(response);
    }

    private String inputAssetWithValidate(){
        while (true){
            String input = Console.readLine();
            return input;
        }
    }
}
