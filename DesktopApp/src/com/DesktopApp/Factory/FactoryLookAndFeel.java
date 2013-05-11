/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DesktopApp.Factory;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import com.DesktopApp.ConstantUtils.ConstantsLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import java.text.ParseException;
import javax.swing.LookAndFeel;

/**
 *
 * @author Jonathan
 */
public class FactoryLookAndFeel {

    public static LookAndFeel getLookAndFeel(String lookAndFeel) throws ParseException {

        if (lookAndFeel.equals(ConstantsLookAndFeel.ACRYL)) {
            return new AcrylLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.AERO)) {
            return new AeroLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.ALUMINIUM)) {
            return new AluminiumLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.BERNSTEIN)) {
            return new BernsteinLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.FAST)) {
            return new FastLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.HIFI)) {
            return new HiFiLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.MCWIN)) {
            return new McWinLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.MINT)) {
            return new MintLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.NOIRE)) {
            return new NoireLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.SMART)) {
            return new SmartLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.LUNA)) {
            return new LunaLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.TEXTURE)) {
            return new TextureLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.BLUELIGHT)) {
            return new SyntheticaBlueLightLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.ALUOXIDE)) {
            return new SyntheticaAluOxideLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.CLASSY)) {
            return new SyntheticaClassyLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.BLACKEYE)) {
            return new SyntheticaBlackEyeLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.SIMPLE2D)) {
            return new SyntheticaSimple2DLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.WHITEVISION)) {
            return new SyntheticaWhiteVisionLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.SKYMETALLIC)) {
            return new SyntheticaSkyMetallicLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.MAUVEMETALLIC)) {
            return new SyntheticaMauveMetallicLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.ORANGEMETALLIC)) {
            return new SyntheticaOrangeMetallicLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.BLUESTEEL)) {
            return new SyntheticaBlueSteelLookAndFeel();
        } else if (lookAndFeel.equals(ConstantsLookAndFeel.BLACKMOON)) {
            return new SyntheticaBlackMoonLookAndFeel();
        }else if (lookAndFeel.equals(ConstantsLookAndFeel.BLUEMOON)) {
            return new SyntheticaBlueMoonLookAndFeel();
        }else if (lookAndFeel.equals(ConstantsLookAndFeel.SILVERMOON)) {
            return new SyntheticaSilverMoonLookAndFeel();
        }else if (lookAndFeel.equals(ConstantsLookAndFeel.BLUEICE)) {
            return new SyntheticaBlueIceLookAndFeel();
        }else if (lookAndFeel.equals(ConstantsLookAndFeel.GRENNDREAM)) {
            return new SyntheticaGreenDreamLookAndFeel();
        }else if (lookAndFeel.equals(ConstantsLookAndFeel.BLACKSTAR)) {
            return new SyntheticaBlackStarLookAndFeel();
        }
        
        
        return new WindowsLookAndFeel();

    }
}
