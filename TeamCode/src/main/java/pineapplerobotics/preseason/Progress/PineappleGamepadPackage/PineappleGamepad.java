package pineapplerobotics.preseason.Progress.PineappleGamepadPackage;

import com.qualcomm.robotcore.hardware.Gamepad;

/**
 * Created by Brandon on 7/12/2017.
 */

public class PineappleGamepad extends Gamepad{

    public PineappleGamepad(Gamepad g){
        this.setGamepadId(g.getGamepadId());
    }

    public boolean advancedA = false;


}
