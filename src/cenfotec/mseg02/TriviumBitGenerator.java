/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfotec.mseg02;

/**
 *
 * @author ozkr16
 */
public class TriviumBitGenerator {
    
    private final int REG_A_SIZE = 93;
    private final int REG_B_SIZE = 84;
    private final int REG_C_SIZE = 110;
    
    private final int REG_A_FF_OFFSET = 66;
    private final int REG_A_FB_OFFSET = 69;
    private final int REG_B_FF_OFFSET = 68;
    private final int REG_B_FB_OFFSET = 77;
    private final int REG_C_FF_OFFSET = 65;
    private final int REG_C_FB_OFFSET = 86;
    
    private BooleanRegister regA = new BooleanRegister(REG_A_SIZE, REG_A_FF_OFFSET, REG_A_FB_OFFSET);
    private BooleanRegister regB = new BooleanRegister(REG_B_SIZE, REG_B_FF_OFFSET, REG_B_FB_OFFSET);
    private BooleanRegister regC = new BooleanRegister(REG_C_SIZE, REG_C_FF_OFFSET, REG_C_FB_OFFSET);
    
}