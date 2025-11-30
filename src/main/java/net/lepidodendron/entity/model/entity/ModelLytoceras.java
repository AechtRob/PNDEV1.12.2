package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLytoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLytoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer shell11;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle1c;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer tentacle2c;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle3c;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle4c;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle5c;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle6c;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer tentacle7c;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle8c;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle9c;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;
    private final AdvancedModelRenderer tentacle10c;
    private final AdvancedModelRenderer siphon;

    private ModelAnimator animator;

    public ModelLytoceras() {
        this.textureWidth = 156;
        this.textureHeight = 156;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -24.0F, -8.5F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, 0.8639F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 45, 0, -5.0F, 11.0728F, -2.9738F, 10, 16, 8, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 84, 22, -7.0F, 9.0728F, 5.0262F, 14, 20, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 19.0728F, -0.5238F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2138F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 82, 0, -7.0F, -10.0F, -0.5F, 14, 20, 1, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 27.0728F, -2.9738F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.4451F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 0, -4.5F, -15.0F, -13.0F, 9, 15, 13, 0.0F, false));
        this.shell2.cubeList.add(new ModelBox(shell2, 66, 97, -6.5F, -17.0F, -9.0F, 13, 19, 1, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.7156F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 29, -4.0F, -12.0F, -13.0F, 8, 12, 13, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.6021F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 43, 29, -3.5F, -10.0F, -13.0F, 7, 10, 13, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.0F, -7.5F);
        this.shell4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1571F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 101, 73, -5.5F, -7.0F, -0.5F, 11, 14, 1, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.4931F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 43, 53, -3.0F, -9.0F, -13.0F, 6, 9, 13, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.6676F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 68, 76, -2.5F, -9.0F, -11.0F, 5, 9, 11, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.7985F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 80, -2.5F, -9.0F, -11.0F, 5, 9, 11, -0.01F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.8465F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 82, 53, -2.5F, -8.0F, -11.0F, 5, 8, 11, -0.02F, false));
        this.shell8.cubeList.add(new ModelBox(shell8, 115, 11, -3.5F, -9.0F, -7.0F, 7, 10, 1, -0.02F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.7112F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 95, 97, -2.5F, -7.0F, -10.0F, 5, 7, 10, -0.04F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, -0.7199F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 0, 101, -2.0F, -7.0F, -10.0F, 4, 7, 10, 0.0F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, -0.9425F, 0.0F, 0.0F);
        this.shell11.cubeList.add(new ModelBox(shell11, 33, 76, -2.0F, -7.0F, -13.0F, 4, 7, 13, -0.01F, false));
        this.shell11.cubeList.add(new ModelBox(shell11, 0, 55, -1.5F, -17.0F, -13.0F, 3, 11, 13, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 12.0728F, 6.0262F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.4363F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 33, 97, -4.0F, 0.0F, 0.0F, 8, 11, 8, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(4.0F, 4.5F, 3.0F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, -0.0222F, -0.5886F, 0.0519F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 113, 0, 0.0F, -2.5F, 0.0F, 6, 5, 5, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-4.0F, 4.5F, 3.0F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, -0.0222F, 0.5886F, -0.0519F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 113, 0, -6.0F, -2.5F, 0.0F, 6, 5, 5, 0.0F, true));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-1.0F, 9.0F, 7.5F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, -0.2269F, 0.0F, 0.0F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 115, 33, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.5118F, -0.0685F, 0.0384F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 115, 43, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle1c = new AdvancedModelRenderer(this);
        this.tentacle1c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle1b.addChild(tentacle1c);
        this.setRotateAngle(tentacle1c, -0.5806F, 0.0292F, -0.0191F);
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 115, 53, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-3.0F, 8.0F, 7.5F);
        this.mantle.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, -0.1931F, -0.075F, -0.7615F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 115, 63, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, -0.1635F, -0.3561F, 0.0225F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 95, 115, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle2c = new AdvancedModelRenderer(this);
        this.tentacle2c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle2b.addChild(tentacle2c);
        this.setRotateAngle(tentacle2c, -0.3839F, -0.3509F, 0.1228F);
        this.tentacle2c.cubeList.add(new ModelBox(tentacle2c, 114, 115, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-3.0F, 5.0F, 7.5F);
        this.mantle.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, -0.2184F, 0.0426F, -0.0094F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 29, 117, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, -0.3145F, 0.041F, -0.0149F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 48, 118, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle3c = new AdvancedModelRenderer(this);
        this.tentacle3c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle3b.addChild(tentacle3c);
        this.setRotateAngle(tentacle3c, -0.2797F, -0.0865F, 0.0114F);
        this.tentacle3c.cubeList.add(new ModelBox(tentacle3c, 67, 118, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-3.0F, 2.0F, 7.5F);
        this.mantle.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, -0.3101F, -0.0403F, -0.7687F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 0, 119, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, 0.0393F, -0.24F, 0.0F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 86, 125, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle4c = new AdvancedModelRenderer(this);
        this.tentacle4c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle4b.addChild(tentacle4c);
        this.setRotateAngle(tentacle4c, -0.3658F, -0.2743F, 0.1253F);
        this.tentacle4c.cubeList.add(new ModelBox(tentacle4c, 105, 125, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-1.0F, 1.0F, 7.5F);
        this.mantle.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, -0.24F, -0.0127F, 0.0031F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 124, 125, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, 0.1658F, 0.0F, 0.0F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 126, 73, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle5c = new AdvancedModelRenderer(this);
        this.tentacle5c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle5b.addChild(tentacle5c);
        this.setRotateAngle(tentacle5c, 0.3289F, -0.1189F, -0.0281F);
        this.tentacle5c.cubeList.add(new ModelBox(tentacle5c, 126, 83, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(1.0F, 9.0F, 7.5F);
        this.mantle.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, -0.2269F, 0.0F, 0.0F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 115, 33, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.5118F, 0.0685F, -0.0384F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 115, 43, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle6c = new AdvancedModelRenderer(this);
        this.tentacle6c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle6b.addChild(tentacle6c);
        this.setRotateAngle(tentacle6c, -0.5806F, -0.0292F, 0.0191F);
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 115, 53, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(3.0F, 8.0F, 7.5F);
        this.mantle.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, -0.1931F, 0.075F, 0.7615F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 115, 63, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, -0.1635F, 0.3561F, -0.0225F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 95, 115, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle7c = new AdvancedModelRenderer(this);
        this.tentacle7c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle7b.addChild(tentacle7c);
        this.setRotateAngle(tentacle7c, -0.3839F, 0.3509F, -0.1228F);
        this.tentacle7c.cubeList.add(new ModelBox(tentacle7c, 114, 115, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(3.0F, 5.0F, 7.5F);
        this.mantle.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, -0.2184F, -0.0426F, 0.0094F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 29, 117, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, -0.3145F, -0.041F, 0.0149F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 48, 118, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle8c = new AdvancedModelRenderer(this);
        this.tentacle8c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle8b.addChild(tentacle8c);
        this.setRotateAngle(tentacle8c, -0.2797F, 0.0865F, -0.0114F);
        this.tentacle8c.cubeList.add(new ModelBox(tentacle8c, 67, 118, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(3.0F, 2.0F, 7.5F);
        this.mantle.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, -0.3101F, 0.0403F, 0.7687F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 0, 119, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, 0.0393F, 0.24F, 0.0F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 86, 125, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle9c = new AdvancedModelRenderer(this);
        this.tentacle9c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle9b.addChild(tentacle9c);
        this.setRotateAngle(tentacle9c, -0.3658F, 0.2743F, -0.1253F);
        this.tentacle9c.cubeList.add(new ModelBox(tentacle9c, 105, 125, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(1.0F, 1.0F, 7.5F);
        this.mantle.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, -0.24F, 0.0127F, -0.0031F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 124, 125, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, 0.1658F, 0.0F, 0.0F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 126, 73, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.tentacle10c = new AdvancedModelRenderer(this);
        this.tentacle10c.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tentacle10b.addChild(tentacle10c);
        this.setRotateAngle(tentacle10c, 0.3289F, 0.1189F, 0.0281F);
        this.tentacle10c.cubeList.add(new ModelBox(tentacle10c, 126, 83, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 10.5F, 6.8F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.4304F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 115, 23, -2.0F, -1.0F, -2.0F, 4, 4, 5, 0.0F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.15F;
        this.base.offsetZ = -0.4F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.03F;
        this.base.offsetX = -0.02F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.3F;
        this.base.rotateAngleY = (float)Math.toRadians(70);
        this.base.rotateAngleX = (float)Math.toRadians(-18);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 0.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLytoceras ee = (EntityPrehistoricFloraLytoceras) entitylivingbaseIn;

        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLytoceras entity = (EntityPrehistoricFloraLytoceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), shell.rotateAngleY + (float) Math.toRadians(0), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(0);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2);


        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));


        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle1a.rotateAngleY + (float) Math.toRadians(0), tentacle1a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle1a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle1c, tentacle1c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle1c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), tentacle1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle2a, tentacle2a.rotateAngleX + (float) Math.toRadians(0), tentacle2a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle2a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle2b, tentacle2b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), tentacle2b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle2c, tentacle2c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), tentacle2c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle3a, tentacle3a.rotateAngleX + (float) Math.toRadians(0), tentacle3a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle3a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle3b, tentacle3b.rotateAngleX + (float) Math.toRadians(0), tentacle3b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle3c, tentacle3c.rotateAngleX + (float) Math.toRadians(0), tentacle3c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle4a, tentacle4a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle4a.rotateAngleY + (float) Math.toRadians(0), tentacle4a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle4a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle4b, tentacle4b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), tentacle4b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle4c, tentacle4c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), tentacle4c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle4c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle5a, tentacle5a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle5a.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5), tentacle5a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle5a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle5b, tentacle5b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle5b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.5), tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle5c, tentacle5c.rotateAngleX + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle5c.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.5), tentacle5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle6a, tentacle6a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle6a.rotateAngleY + (float) Math.toRadians(0), tentacle6a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle6a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle6b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle6c, tentacle6c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle6c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), tentacle6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle7a, tentacle7a.rotateAngleX + (float) Math.toRadians(0), tentacle7a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle7a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle7a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle7b, tentacle7b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), tentacle7b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle7c, tentacle7c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), tentacle7c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle8a, tentacle8a.rotateAngleX + (float) Math.toRadians(0), tentacle8a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle8a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle8b, tentacle8b.rotateAngleX + (float) Math.toRadians(0), tentacle8b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle8c, tentacle8c.rotateAngleX + (float) Math.toRadians(0), tentacle8c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle9a, tentacle9a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle9a.rotateAngleY + (float) Math.toRadians(0), tentacle9a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle9a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle9b, tentacle9b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), tentacle9b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle9c, tentacle9c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), tentacle9c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle9c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle10a, tentacle10a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle10a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5), tentacle10a.rotateAngleZ + (float) Math.toRadians(5));
        this.tentacle10a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle10b, tentacle10b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle10b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.5), tentacle10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle10c, tentacle10c.rotateAngleX + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle10c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.5), tentacle10c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(0.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.2),(float)(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-0.2));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraLytoceras ee = (EntityPrehistoricFloraLytoceras) e;

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetX = -1f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

