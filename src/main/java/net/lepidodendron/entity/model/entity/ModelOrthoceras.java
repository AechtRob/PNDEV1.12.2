package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.EntityPrehistoricFloraOrthoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOrthoceras extends ModelBasePalaeopedia {
    public AdvancedModelRendererExtended shellbase;
    public AdvancedModelRendererExtended shellbasebottom;
    public AdvancedModelRendererExtended shellbasetop;
    public AdvancedModelRendererExtended shell1;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended shell2;
    public AdvancedModelRendererExtended shell1top;
    public AdvancedModelRendererExtended shell1bottom;
    public AdvancedModelRendererExtended shell3;
    public AdvancedModelRendererExtended shell2top;
    public AdvancedModelRendererExtended shell2bottom;
    public AdvancedModelRendererExtended shell4;
    public AdvancedModelRendererExtended shell3top;
    public AdvancedModelRendererExtended shell3bottom;
    public AdvancedModelRendererExtended shell5;
    public AdvancedModelRendererExtended shell4top;
    public AdvancedModelRendererExtended shell4bottom;
    public AdvancedModelRendererExtended shell6;
    public AdvancedModelRendererExtended shell5top;
    public AdvancedModelRendererExtended shell5bottom;
    public AdvancedModelRendererExtended shell7;
    public AdvancedModelRendererExtended shell6top;
    public AdvancedModelRendererExtended shell6bottom;
    public AdvancedModelRendererExtended shell8;
    public AdvancedModelRendererExtended shell7top;
    public AdvancedModelRendererExtended shell7bottom;
    public AdvancedModelRendererExtended shell9;
    public AdvancedModelRendererExtended shell8top;
    public AdvancedModelRendererExtended shell8bottom;
    public AdvancedModelRendererExtended shell10;
    public AdvancedModelRendererExtended shell9top;
    public AdvancedModelRendererExtended shell9bottom;
    public AdvancedModelRendererExtended shell11;
    public AdvancedModelRendererExtended shell10top;
    public AdvancedModelRendererExtended shell10bottom;
    public AdvancedModelRendererExtended shelltip;
    public AdvancedModelRendererExtended shellcover1;
    public AdvancedModelRendererExtended hyponome;
    public AdvancedModelRendererExtended headleft;
    public AdvancedModelRendererExtended headright;
    public AdvancedModelRendererExtended tentacle1a;
    public AdvancedModelRendererExtended tentacle2a;
    public AdvancedModelRendererExtended tentacle3a;
    public AdvancedModelRendererExtended tentacle4a;
    public AdvancedModelRendererExtended tentacle5a;
    public AdvancedModelRendererExtended tentacle6a;
    public AdvancedModelRendererExtended tentacle7a;
    public AdvancedModelRendererExtended tentacle8a;
    public AdvancedModelRendererExtended tentacle9a;
    public AdvancedModelRendererExtended tentacle10a;
    public AdvancedModelRendererExtended shellcover2;
    public AdvancedModelRendererExtended shellcovertop;
    public AdvancedModelRendererExtended shellcover2a;
    public AdvancedModelRendererExtended shellcover3;
    public AdvancedModelRendererExtended shellcovertop1;
    public AdvancedModelRendererExtended shellcovertop2;
    public AdvancedModelRendererExtended eyeleft;
    public AdvancedModelRendererExtended eyeright;
    public AdvancedModelRendererExtended tentacle1b;
    public AdvancedModelRendererExtended tentacle2b;
    public AdvancedModelRendererExtended tentacle3b;
    public AdvancedModelRendererExtended tentacle4b;
    public AdvancedModelRendererExtended tentacle5b;
    public AdvancedModelRendererExtended tentacle6b;
    public AdvancedModelRendererExtended tentacle7b;
    public AdvancedModelRendererExtended tentacle8b;
    public AdvancedModelRendererExtended tentacle9b;
    public AdvancedModelRendererExtended tentacle10b;

    public ModelOrthoceras() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.tentacle1a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle1a.setRotationPoint(4.7F, -0.4F, 1.0F);
        this.tentacle1a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle1a, -0.05235987755982988F, 0.0F, -1.5707963267948966F);
        this.shell10bottom = new AdvancedModelRendererExtended(this, 205, 49);
        this.shell10bottom.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.shell10bottom.addBox(-1.0F, 0.0F, -10.0F, 2, 1, 5, 0.0F);
        this.tentacle4a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle4a.setRotationPoint(-3.7F, -3.1F, 1.0F);
        this.tentacle4a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle4a, -0.10471975511965977F, 0.0F, 2.443460952792061F);
        this.shell11 = new AdvancedModelRendererExtended(this, 175, 42);
        this.shell11.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.shell11.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.shell3 = new AdvancedModelRendererExtended(this, 165, 138);
        this.shell3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.shell3.addBox(-5.0F, -4.0F, 0.0F, 10, 8, 11, 0.0F);
        this.tentacle6a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle6a.setRotationPoint(-3.7F, 2.3F, 1.0F);
        this.tentacle6a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle6a, -0.10471975511965977F, 0.0F, 0.8726646259971648F);
        this.shell1bottom = new AdvancedModelRendererExtended(this, 66, 62);
        this.shell1bottom.setRotationPoint(0.0F, 5.0F, 10.0F);
        this.shell1bottom.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.tentacle7b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle7b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle7b, -0.10471975511965977F, 0.0F, 0.0F);
        this.tentacle9b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle9b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle9b, -0.10471975511965977F, 0.0F, 0.0F);
        this.head = new AdvancedModelRendererExtended(this, 33, 87);
        this.head.setRotationPoint(0.0F, 1.5F, -17.0F);
        this.head.addBox(-5.0F, -5.0F, 0.0F, 10, 10, 7, 0.0F);
        this.shell1top = new AdvancedModelRendererExtended(this, 0, 62);
        this.shell1top.setRotationPoint(0.0F, -6.0F, 10.0F);
        this.shell1top.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.shell2top = new AdvancedModelRendererExtended(this, 111, 166);
        this.shell2top.setRotationPoint(0.0F, -5.5F, 10.0F);
        this.shell2top.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.shellbasetop = new AdvancedModelRendererExtended(this, 39, 11);
        this.shellbasetop.setRotationPoint(0.0F, -6.5F, 0.0F);
        this.shellbasetop.addBox(-5.5F, 0.0F, -10.0F, 11, 1, 13, 0.0F);
        this.hyponome = new AdvancedModelRendererExtended(this, 0, 0);
        this.hyponome.setRotationPoint(0.0F, 3.0F, 4.8F);
        this.hyponome.addBox(-1.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(hyponome, -1.1344640137963142F, 0.0F, 0.0F);
        this.tentacle4b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle4b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle4b, -0.10471975511965977F, 0.0F, 0.0F);
        this.shellbasebottom = new AdvancedModelRendererExtended(this, 0, 47);
        this.shellbasebottom.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.shellbasebottom.addBox(-5.5F, 0.0F, -10.0F, 11, 1, 13, 0.0F);
        this.tentacle1b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle1b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle1b, -0.20943951023931953F, 0.0F, 0.0F);
        this.shellcover2 = new AdvancedModelRendererExtended(this, 72, 39);
        this.shellcover2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shellcover2.addBox(-5.5F, 0.0F, 0.0F, 11, 2, 2, 0.0F);
        this.shell4top = new AdvancedModelRendererExtended(this, 135, 126);
        this.shell4top.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shell4top.addBox(-4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F);
        this.shell6top = new AdvancedModelRendererExtended(this, 152, 93);
        this.shell6top.setRotationPoint(0.0F, -3.5F, 10.0F);
        this.shell6top.addBox(-3.0F, 0.0F, -10.0F, 6, 1, 8, 0.0F);
        this.tentacle8a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle8a.setRotationPoint(-1.3F, 3.7F, 1.0F);
        this.tentacle8a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle8a, -0.10471975511965977F, 0.0F, 0.17453292519943295F);
        this.eyeleft = new AdvancedModelRendererExtended(this, 5, 6);
        this.eyeleft.setRotationPoint(0.7F, -1.0F, 4.0F);
        this.eyeleft.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.shell2bottom = new AdvancedModelRendererExtended(this, 207, 166);
        this.shell2bottom.setRotationPoint(0.0F, 4.5F, 10.0F);
        this.shell2bottom.addBox(-5.0F, 0.0F, -10.0F, 10, 1, 13, 0.0F);
        this.shellcover3 = new AdvancedModelRendererExtended(this, 0, 88);
        this.shellcover3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shellcover3.addBox(-4.5F, 0.0F, 0.0F, 9, 2, 1, 0.0F);
        this.tentacle8b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle8b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle8b, -0.10471975511965977F, 0.0F, 0.0F);
        this.shell7 = new AdvancedModelRendererExtended(this, 182, 77);
        this.shell7.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.shell7.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 7, 0.0F);
        this.shellcover1 = new AdvancedModelRendererExtended(this, 37, 25);
        this.shellcover1.setRotationPoint(0.0F, -6.4F, 1.2F);
        this.shellcover1.addBox(-6.5F, 0.0F, 0.0F, 13, 2, 5, 0.0F);
        this.setRotateAngle(shellcover1, 0.17278759594743862F, 0.0F, 0.0F);
        this.shell4bottom = new AdvancedModelRendererExtended(this, 211, 126);
        this.shell4bottom.setRotationPoint(0.0F, 3.5F, 10.0F);
        this.shell4bottom.addBox(-4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F);
        this.tentacle3a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle3a.setRotationPoint(3.7F, -3.1F, 1.0F);
        this.tentacle3a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle3a, -0.10471975511965977F, 0.0F, -2.443460952792061F);
        this.shell2 = new AdvancedModelRendererExtended(this, 158, 158);
        this.shell2.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.shell2.addBox(-5.5F, -4.5F, 0.0F, 11, 9, 13, 0.0F);
        this.shell3bottom = new AdvancedModelRendererExtended(this, 208, 145);
        this.shell3bottom.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.shell3bottom.addBox(-4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F);
        this.shell5bottom = new AdvancedModelRendererExtended(this, 215, 108);
        this.shell5bottom.setRotationPoint(0.0F, 3.0F, 10.0F);
        this.shell5bottom.addBox(-3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F);
        this.shell1 = new AdvancedModelRendererExtended(this, 0, 24);
        this.shell1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell1.addBox(-6.0F, -5.0F, 0.0F, 12, 10, 13, 0.0F);
        this.shell6bottom = new AdvancedModelRendererExtended(this, 212, 93);
        this.shell6bottom.setRotationPoint(0.0F, 2.5F, 10.0F);
        this.shell6bottom.addBox(-3.0F, 0.0F, -10.0F, 6, 1, 8, 0.0F);
        this.shell7top = new AdvancedModelRendererExtended(this, 157, 80);
        this.shell7top.setRotationPoint(0.0F, -3.0F, 10.0F);
        this.shell7top.addBox(-2.5F, 0.0F, -10.0F, 5, 1, 7, 0.0F);
        this.tentacle5a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle5a.setRotationPoint(3.7F, 2.3F, 1.0F);
        this.tentacle5a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle5a, -0.10471975511965977F, 0.0F, -0.8726646259971648F);
        this.tentacle10a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle10a.setRotationPoint(-1.3F, -4.5F, 1.0F);
        this.tentacle10a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle10a, -0.10471975511965977F, 0.0F, 2.96705972839036F);
        this.tentacle6b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle6b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle6b, -0.10471975511965977F, 0.0F, 0.0F);
        this.shell3top = new AdvancedModelRendererExtended(this, 124, 145);
        this.shell3top.setRotationPoint(0.0F, -5.0F, 10.0F);
        this.shell3top.addBox(-4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F);
        this.shell5top = new AdvancedModelRendererExtended(this, 143, 108);
        this.shell5top.setRotationPoint(0.0F, -4.0F, 10.0F);
        this.shell5top.addBox(-3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F);
        this.shell8top = new AdvancedModelRendererExtended(this, 161, 68);
        this.shell8top.setRotationPoint(0.0F, -2.5F, 10.0F);
        this.shell8top.addBox(-2.0F, 0.0F, -10.0F, 4, 1, 7, 0.0F);
        this.shell9bottom = new AdvancedModelRendererExtended(this, 208, 57);
        this.shell9bottom.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.shell9bottom.addBox(-1.5F, 0.0F, -10.0F, 3, 1, 7, 0.0F);
        this.tentacle7a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle7a.setRotationPoint(1.3F, 3.7F, 1.0F);
        this.tentacle7a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle7a, -0.10471975511965977F, 0.0F, -0.17453292519943295F);
        this.shellcovertop = new AdvancedModelRendererExtended(this, 74, 17);
        this.shellcovertop.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shellcovertop.addBox(-5.0F, -1.0F, 0.0F, 10, 1, 6, 0.0F);
        this.shellcover2a = new AdvancedModelRendererExtended(this, 68, 57);
        this.shellcover2a.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.shellcover2a.addBox(-5.5F, 0.0F, 0.0F, 11, 2, 1, 0.0F);
        this.tentacle10b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle10b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle10b, -0.10471975511965977F, 0.0F, 0.0F);
        this.shell5 = new AdvancedModelRendererExtended(this, 178, 103);
        this.shell5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell5.addBox(-4.0F, -3.0F, 0.0F, 8, 6, 10, 0.0F);
        this.shellbase = new AdvancedModelRendererExtended(this, 0, 0);
        this.shellbase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shellbase.addBox(-6.5F, -5.5F, -10.0F, 13, 11, 13, 0.0F);
        this.setRotateAngle(shellbase, 0.0F, 3.096039560112741F, 0.0F);
        this.shell4 = new AdvancedModelRendererExtended(this, 172, 120);
        this.shell4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.shell4.addBox(-4.5F, -3.5F, 0.0F, 9, 7, 10, 0.0F);
        this.shell6 = new AdvancedModelRendererExtended(this, 181, 89);
        this.shell6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell6.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 8, 0.0F);
        this.eyeright = new AdvancedModelRendererExtended(this, 0, 29);
        this.eyeright.setRotationPoint(-0.8F, -1.0F, 4.0F);
        this.eyeright.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.shell10top = new AdvancedModelRendererExtended(this, 173, 49);
        this.shell10top.setRotationPoint(0.0F, -1.5F, 10.0F);
        this.shell10top.addBox(-1.0F, 0.0F, -10.0F, 2, 1, 5, 0.0F);
        this.tentacle2b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle2b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle2b, -0.20943951023931953F, 0.0F, 0.0F);
        this.headright = new AdvancedModelRendererExtended(this, 75, 117);
        this.headright.setRotationPoint(-6.0F, -0.2F, 0.0F);
        this.headright.addBox(0.0F, -4.5F, 0.0F, 1, 9, 7, 0.0F);
        this.shellcovertop2 = new AdvancedModelRendererExtended(this, 63, 8);
        this.shellcovertop2.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.shellcovertop2.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.tentacle3b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle3b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle3b, -0.10471975511965977F, 0.0F, 0.0F);
        this.shell10 = new AdvancedModelRendererExtended(this, 188, 49);
        this.shell10.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell10.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 5, 0.0F);
        this.tentacle2a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle2a.setRotationPoint(-4.7F, -0.4F, 1.0F);
        this.tentacle2a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle2a, -0.05235987755982988F, 0.0F, 1.5707963267948966F);
        this.tentacle9a = new AdvancedModelRendererExtended(this, 100, 5);
        this.tentacle9a.setRotationPoint(1.3F, -4.5F, 1.0F);
        this.tentacle9a.addBox(-1.0F, -1.0F, -12.0F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tentacle9a, -0.10471975511965977F, 0.0F, -2.96705972839036F);
        this.shell8 = new AdvancedModelRendererExtended(this, 184, 66);
        this.shell8.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell8.addBox(-2.5F, -1.5F, 0.0F, 5, 3, 7, 0.0F);
        this.shell9 = new AdvancedModelRendererExtended(this, 185, 56);
        this.shell9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell9.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 7, 0.0F);
        this.shelltip = new AdvancedModelRendererExtended(this, 175, 37);
        this.shelltip.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shelltip.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.shell7bottom = new AdvancedModelRendererExtended(this, 209, 80);
        this.shell7bottom.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.shell7bottom.addBox(-2.5F, 0.0F, -10.0F, 5, 1, 7, 0.0F);
        this.shell8bottom = new AdvancedModelRendererExtended(this, 209, 68);
        this.shell8bottom.setRotationPoint(0.0F, 1.5F, 10.0F);
        this.shell8bottom.addBox(-2.0F, 0.0F, -10.0F, 4, 1, 7, 0.0F);
        this.headleft = new AdvancedModelRendererExtended(this, 59, 117);
        this.headleft.setRotationPoint(5.0F, -0.2F, 0.0F);
        this.headleft.addBox(0.0F, -4.5F, 0.0F, 1, 9, 7, 0.0F);
        this.tentacle5b = new AdvancedModelRendererExtended(this, 105, 20);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.tentacle5b.addBox(-0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tentacle5b, -0.10471975511965977F, 0.0F, 0.0F);
        this.shell9top = new AdvancedModelRendererExtended(this, 164, 57);
        this.shell9top.setRotationPoint(0.0F, -2.0F, 10.0F);
        this.shell9top.addBox(-1.5F, 0.0F, -10.0F, 3, 1, 7, 0.0F);
        this.shellcovertop1 = new AdvancedModelRendererExtended(this, 68, 60);
        this.shellcovertop1.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.shellcovertop1.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.head.addChild(this.tentacle1a);
        this.shell10.addChild(this.shell10bottom);
        this.head.addChild(this.tentacle4a);
        this.shell10.addChild(this.shell11);
        this.shell2.addChild(this.shell3);
        this.head.addChild(this.tentacle6a);
        this.shell1.addChild(this.shell1bottom);
        this.tentacle7a.addChild(this.tentacle7b);
        this.tentacle9a.addChild(this.tentacle9b);
        this.shellbase.addChild(this.head);
        this.shell1.addChild(this.shell1top);
        this.shell2.addChild(this.shell2top);
        this.shellbase.addChild(this.shellbasetop);
        this.head.addChild(this.hyponome);
        this.tentacle4a.addChild(this.tentacle4b);
        this.shellbase.addChild(this.shellbasebottom);
        this.tentacle1a.addChild(this.tentacle1b);
        this.shellcover1.addChild(this.shellcover2);
        this.shell4.addChild(this.shell4top);
        this.shell6.addChild(this.shell6top);
        this.head.addChild(this.tentacle8a);
        this.headleft.addChild(this.eyeleft);
        this.shell2.addChild(this.shell2bottom);
        this.shellcover2.addChild(this.shellcover3);
        this.tentacle8a.addChild(this.tentacle8b);
        this.shell6.addChild(this.shell7);
        this.head.addChild(this.shellcover1);
        this.shell4.addChild(this.shell4bottom);
        this.head.addChild(this.tentacle3a);
        this.shell1.addChild(this.shell2);
        this.shell3.addChild(this.shell3bottom);
        this.shell5.addChild(this.shell5bottom);
        this.shellbase.addChild(this.shell1);
        this.shell6.addChild(this.shell6bottom);
        this.shell7.addChild(this.shell7top);
        this.head.addChild(this.tentacle5a);
        this.head.addChild(this.tentacle10a);
        this.tentacle6a.addChild(this.tentacle6b);
        this.shell3.addChild(this.shell3top);
        this.shell5.addChild(this.shell5top);
        this.shell8.addChild(this.shell8top);
        this.shell9.addChild(this.shell9bottom);
        this.head.addChild(this.tentacle7a);
        this.shellcover1.addChild(this.shellcovertop);
        this.shellcover1.addChild(this.shellcover2a);
        this.tentacle10a.addChild(this.tentacle10b);
        this.shell4.addChild(this.shell5);
        this.shell3.addChild(this.shell4);
        this.shell5.addChild(this.shell6);
        this.headright.addChild(this.eyeright);
        this.shell10.addChild(this.shell10top);
        this.tentacle2a.addChild(this.tentacle2b);
        this.head.addChild(this.headright);
        this.shellcovertop.addChild(this.shellcovertop2);
        this.tentacle3a.addChild(this.tentacle3b);
        this.shell9.addChild(this.shell10);
        this.head.addChild(this.tentacle2a);
        this.head.addChild(this.tentacle9a);
        this.shell7.addChild(this.shell8);
        this.shell8.addChild(this.shell9);
        this.shell11.addChild(this.shelltip);
        this.shell7.addChild(this.shell7bottom);
        this.shell8.addChild(this.shell8bottom);
        this.head.addChild(this.headleft);
        this.tentacle5a.addChild(this.tentacle5b);
        this.shell9.addChild(this.shell9top);
        this.shellcovertop.addChild(this.shellcovertop1);

        this.tentacle2a.rotateAngleX = 0.28F;
        this.tentacle4a.rotateAngleX = 0.28F;
        this.tentacle6a.rotateAngleX = 0.28F;
        this.tentacle8a.rotateAngleX = 0.28F;
        this.tentacle10a.rotateAngleX = 0.28F;
        this.tentacle1a.rotateAngleX = 0.28F;
        this.tentacle3a.rotateAngleX = 0.28F;
        this.tentacle5a.rotateAngleX = 0.28F;
        this.tentacle9a.rotateAngleX = 0.28F;
        this.tentacle7a.rotateAngleX = 0.28F;


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shellbase.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.shellbase.offsetY = 0.6F;
        this.shellbase.offsetX = 0.2F;
        this.shellbase.offsetZ = 2.0F;
        this.shellbase.rotateAngleY = (float)Math.toRadians(120);
        this.shellbase.rotateAngleX = (float)Math.toRadians(1);
        this.shellbase.rotateAngleZ = (float)Math.toRadians(0);
        this.shellbase.scaleChildren = true;
        float scaler = 0.4F;
        this.shellbase.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(shellbase, 1.2F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.shellbase.render(f);
        //Reset rotations, positions and sizing:
        this.shellbase.setScale(1.0F, 1.0F, 1.0F);
        this.shellbase.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        this.resetToDefaultPose();
        //this.shellbase.offsetY = 1.2F;
        this.shellbase.offsetZ = -0.5F;

        AdvancedModelRendererExtended[] tentacle1 = {this.tentacle1a, this.tentacle1b};
        AdvancedModelRendererExtended[] tentacle2 = {this.tentacle2a, this.tentacle2b};
        AdvancedModelRendererExtended[] tentacle3 = {this.tentacle3a, this.tentacle3b};
        AdvancedModelRendererExtended[] tentacle4 = {this.tentacle4a, this.tentacle4b};
        AdvancedModelRendererExtended[] tentacle5 = {this.tentacle5a, this.tentacle5b};
        AdvancedModelRendererExtended[] tentacle6 = {this.tentacle6a, this.tentacle6b};
        AdvancedModelRendererExtended[] tentacle7 = {this.tentacle7a, this.tentacle7b};
        AdvancedModelRendererExtended[] tentacle8 = {this.tentacle8a, this.tentacle8b};
        AdvancedModelRendererExtended[] tentacle9 = {this.tentacle9a, this.tentacle9b};
        AdvancedModelRendererExtended[] tentacle10 = {this.tentacle10a, this.tentacle10b};

        float speed = 0.22F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        EntityPrehistoricFloraOrthoceras ee = (EntityPrehistoricFloraOrthoceras) e;
        if (ee.isAtBottom()) {
            //this.shellbase.offsetY = 1.6F;
            speed = speed * 2F;
            //Left:
            this.chainSwing(tentacle2, speed, -0.2F, 0, f2, 1F);
            //Left lower middle:
            this.chainSwing(tentacle6, speed, -0.2F, 0, f2, 1F);
            //Left lower bottom:
            this.chainSwing(tentacle8, speed, -0.2F, 0, f2, 1F);
            //Left upper middle:
            this.chainSwing(tentacle4, speed, -0.2F, 0, f2, 1F);
            //Left upper top:
            this.chainSwing(tentacle10, speed, -0.2F, 0, f2, 1F);

            //Right:
            this.chainSwing(tentacle1, speed, -0.2F, 0, f2, 1F);
            //Right lower middle:
            this.chainSwing(tentacle5, speed, -0.2F, 0, f2, 1F);
            //Right lower bottom:
            this.chainSwing(tentacle7, speed, -0.2F, 0, f2, 1F);
            //Right upper middle:
            this.chainSwing(tentacle3, speed, -0.2F, 0, f2, 1F);
            //Right upper top:
            this.chainSwing(tentacle9, speed, -0.2F, 0, f2, 1F);
        }

        //Left:
        this.chainWave(tentacle2, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle6, speed, -0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle8, speed, -0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle4, speed, -0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle10, speed, -0.3F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle1, speed, -0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle5, speed, -0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle7, speed, -0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle3, speed, -0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle9, speed, -0.3F, -2, f2, 1F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            if (ee.isAtBottom()) {
                this.walk(shellbase, 0.3F, 0.25F, false, 0,0.2F,1.5F,1.0F);
                bobSpeed = 0.2F;
            }
            else {
                this.shellbase.offsetZ = this.moveBoxExtended(speed, 0.08F, false, 4, f2, 1);
            }
            this.bob(shellbase, bobSpeed, 0.8F, false, f2, 2);
        }
        else {
            this.shellbase.rotateAngleZ = (float) Math.toRadians(90);
            this.shellbase.offsetY = 1.2F;
        }

    }

}
