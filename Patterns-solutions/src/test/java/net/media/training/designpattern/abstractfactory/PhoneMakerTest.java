package net.media.training.designpattern.abstractfactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 9:13:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMakerTest {

    @Test
    public void AndroidPhoneIsMadeCorrectly() {
        PhoneMaker androidManufacturer = new AndroidManufacturer();
        Case phone = androidManufacturer.buildCase();

        // assertEquals(AndroidCase.class, phone.getClass());
        // assertEquals(AndroidScreen.class, phone.getScreen().getClass());
        // assertEquals(AndroidMotherBoard.class, phone.getMotherBoard().getClass());
        // assertEquals(AndroidProcessor.class, phone.getProcessor().getClass());
        // assertEquals(Battery.class, phone.getBattery().getClass());
    }

    @Test
    public void IPhoneIsMadeCorrectly() {
        PhoneMaker iphoneManufacturer = new IphoneManufacturer();
        Case phone = iphoneManufacturer.buildCase();

        // assertEquals(IphoneCase.class, phone.getClass());
        // assertEquals(IphoneScreen.class, phone.getScreen().getClass());
        // assertEquals(IphoneMotherBoard.class, phone.getMotherBoard().getClass());
        // assertEquals(IphoneProcessor.class, phone.getProcessor().getClass());
        // assertEquals(Battery.class, phone.getBattery().getClass());
    }
}
