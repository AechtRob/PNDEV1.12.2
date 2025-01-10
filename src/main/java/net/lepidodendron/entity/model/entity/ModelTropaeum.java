package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTropaeum;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTropaeum extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer Shell10;
    private final AdvancedModelRenderer Shell11;
    private final AdvancedModelRenderer Shell12;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer tentacle2c;
    private final AdvancedModelRenderer tentacle2d;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer tentacle7c;
    private final AdvancedModelRenderer tentacle7d;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;

    private ModelAnimator animator;

    public ModelTropaeum() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(-0.5F, 9.0F, 0.5F);


        this.Shell = new AdvancedModelRenderer(this);
        this.Shell.setRotationPoint(0.5F, 10.0F, 7.5F);
        this.Root.addChild(Shell);
        this.setRotateAngle(Shell, 0.6109F, 0.0F, 0.0F);
        this.Shell.cubeList.add(new ModelBox(Shell, 45, 39, -3.5F, -7.1808F, -5.5736F, 7, 8, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.0F, -2.275F);
        this.Shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 52, -3.5F, -4.0F, -0.5F, 8, 8, 1, 0.0F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -3.5F, -6.0F, -10.0F, 7, 7, 10, -0.01F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 24, 0, -4.0F, -4.65F, -4.825F, 8, 7, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.25F, -1.15F);
        this.Shell2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.336F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 27, -3.5F, -4.5F, -0.5F, 8, 8, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.05F, -7.475F);
        this.Shell2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 61, 12, -3.5F, -3.5F, -0.5F, 8, 7, 1, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.6109F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 17, -3.0F, -5.1808F, -9.4264F, 6, 6, 10, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 16, 64, -3.5F, -3.55F, -5.75F, 7, 6, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.35F, -8.75F);
        this.Shell3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 64, -3.5F, -3.0F, -0.5F, 7, 6, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.05F, -1.575F);
        this.Shell3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 61, -4.0F, -3.0F, -0.5F, 8, 6, 1, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6981F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 22, 23, -3.0F, -5.7412F, -9.0341F, 6, 6, 10, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.925F, -5.7F);
        this.Shell4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0654F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 53, -3.5F, -3.0F, -0.5F, 7, 6, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.925F, -2.95F);
        this.Shell4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 0, -3.5F, -3.0F, -0.5F, 7, 6, 1, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.7243F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 33, -2.5F, -5.4462F, -8.1051F, 5, 5, 9, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.8029F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 25, 8, -2.5F, -5.9537F, -8.6993F, 5, 5, 9, -0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.8029F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 19, 39, -2.0F, -5.8788F, -9.4772F, 4, 5, 9, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.8552F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 45, 14, -2.0F, -5.2164F, -8.9763F, 4, 5, 8, -0.01F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.8683F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 38, 52, -1.5F, -4.3947F, -7.796F, 3, 5, 7, 0.0F, false));

        this.Shell10 = new AdvancedModelRenderer(this);
        this.Shell10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell9.addChild(Shell10);
        this.setRotateAngle(Shell10, -0.8552F, 0.0F, 0.0F);
        this.Shell10.cubeList.add(new ModelBox(Shell10, 11, 53, -1.0F, -3.0021F, -7.0654F, 2, 4, 7, 0.0F, false));

        this.Shell11 = new AdvancedModelRenderer(this);
        this.Shell11.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell10.addChild(Shell11);
        this.setRotateAngle(Shell11, -0.8552F, 0.0F, 0.0F);
        this.Shell11.cubeList.add(new ModelBox(Shell11, 0, 0, -0.5F, -3.296F, -3.2898F, 1, 4, 4, 0.0F, false));
        this.Shell11.cubeList.add(new ModelBox(Shell11, 0, 38, 0.0F, -9.296F, -9.2898F, 0, 10, 9, 0.0F, false));

        this.Shell12 = new AdvancedModelRenderer(this);
        this.Shell12.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell11.addChild(Shell12);
        this.setRotateAngle(Shell12, -0.6763F, 0.0F, 0.0F);


        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 5.0F, 3.0F);
        this.Root.addChild(mantle);
        this.setRotateAngle(mantle, 0.0436F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 44, 0, -2.5F, -0.25F, 0.0F, 6, 5, 7, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-2.5043F, 0.9649F, 2.805F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0074F, -0.3651F, -0.0961F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 0, 17, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 0, 0, -1.075F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(3.5043F, 0.9649F, 2.805F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0074F, 0.3651F, 0.0961F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 0, 17, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 0, 0, 0.075F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.5F, 4.925F, 1.95F);
        this.mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2182F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 0, 59, -1.5F, -1.5F, -0.5F, 3, 2, 5, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.25F, 3.25F, 6.5F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, 0.0436F, 0.0F, 0.0F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 26, 71, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, 0.1309F, 0.0F, 0.0F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 14, 71, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-1.75F, 4.0F, 6.5F);
        this.mantle.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, -0.196F, -0.3373F, 0.8959F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 43, 70, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, 0.0905F, 0.2604F, 0.0272F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 69, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle2c = new AdvancedModelRenderer(this);
        this.tentacle2c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle2b.addChild(tentacle2c);
        this.setRotateAngle(tentacle2c, 0.393F, -0.0403F, -0.0167F);
        this.tentacle2c.cubeList.add(new ModelBox(tentacle2c, 64, 36, -1.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tentacle2d = new AdvancedModelRenderer(this);
        this.tentacle2d.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.tentacle2c.addChild(tentacle2d);
        this.setRotateAngle(tentacle2d, 0.6109F, 0.0F, 0.0F);
        this.tentacle2d.cubeList.add(new ModelBox(tentacle2d, 0, 21, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-1.75F, 2.0F, 6.5F);
        this.mantle.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, 0.0F, -0.1745F, 0.0F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 69, 20, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, 0.0873F, 0.2618F, 0.0F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 67, 68, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-1.5F, 0.75F, 6.5F);
        this.mantle.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, 0.1745F, 0.0F, -0.7854F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 55, 68, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, -0.262F, 0.0421F, -0.0113F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 7, 67, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-0.25F, 0.5F, 6.5F);
        this.mantle.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, 0.1752F, -0.0859F, -0.0152F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 0, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, -0.264F, 0.1264F, -0.0341F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 48, 64, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(1.25F, 3.25F, 6.5F);
        this.mantle.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, 0.0436F, 0.0F, 0.0F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 26, 71, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, 0.1309F, 0.0F, 0.0F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 14, 71, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(2.75F, 4.0F, 6.5F);
        this.mantle.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, -0.196F, 0.3373F, -0.8959F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 43, 70, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, 0.0905F, -0.2604F, -0.0272F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 69, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle7c = new AdvancedModelRenderer(this);
        this.tentacle7c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle7b.addChild(tentacle7c);
        this.setRotateAngle(tentacle7c, 0.393F, 0.0403F, 0.0167F);
        this.tentacle7c.cubeList.add(new ModelBox(tentacle7c, 64, 36, -1.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F, true));

        this.tentacle7d = new AdvancedModelRenderer(this);
        this.tentacle7d.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.tentacle7c.addChild(tentacle7d);
        this.setRotateAngle(tentacle7d, 0.6109F, 0.0F, 0.0F);
        this.tentacle7d.cubeList.add(new ModelBox(tentacle7d, 0, 21, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(2.75F, 2.0F, 6.5F);
        this.mantle.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, 0.0F, 0.1745F, 0.0F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 69, 20, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, 0.0873F, -0.2618F, 0.0F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 67, 68, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(2.5F, 0.75F, 6.5F);
        this.mantle.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, 0.1745F, 0.0F, 0.7854F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 55, 68, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, -0.262F, -0.0421F, 0.0113F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 7, 67, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(1.25F, 0.5F, 6.5F);
        this.mantle.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, 0.1752F, 0.0859F, 0.0152F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 0, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, -0.264F, -0.1264F, 0.0341F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 48, 64, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.2F;
        this.Root.offsetX = -0.15F;
        this.Root.offsetZ = -0.4F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Root.offsetZ = -0.1F;
        this.Root.offsetY = -0.03F;
        this.Root.offsetX = -0.02F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -2.0F;
        this.Root.offsetX = -1.338F;
        this.Root.rotateAngleY = (float)Math.toRadians(200);
        this.Root.rotateAngleX = (float)Math.toRadians(8);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 1.63F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        EntityPrehistoricFloraTropaeum ee = (EntityPrehistoricFloraTropaeum) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTropaeum entity = (EntityPrehistoricFloraTropaeum) entitylivingbaseIn;
        int animCycle = 36;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*0.7), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-120))*-0.5), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*0.3));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-40))*0.25);
        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-40))*0.08), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*0.005));
        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*-1), tentacle1a.rotateAngleY + (float) Math.toRadians(0), tentacle1a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*-2), tentacle1b.rotateAngleY + (float) Math.toRadians(0), tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle2a, tentacle2a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*-3), tentacle2a.rotateAngleY + (float) Math.toRadians(0), tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle2b, tentacle2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*-4), tentacle2b.rotateAngleY + (float) Math.toRadians(0), tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle2c, tentacle2c.rotateAngleX + (float) Math.toRadians(-17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*-12), tentacle2c.rotateAngleY + (float) Math.toRadians(0), tentacle2c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle2d, tentacle2d.rotateAngleX + (float) Math.toRadians(-33.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-210))*-15), tentacle2d.rotateAngleY + (float) Math.toRadians(0), tentacle2d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle3a, tentacle3a.rotateAngleX + (float) Math.toRadians(0), tentacle3a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*-1), tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle3b, tentacle3b.rotateAngleX + (float) Math.toRadians(0), tentacle3b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-250))*-2), tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle4a, tentacle4a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-120))*2), tentacle4a.rotateAngleY + (float) Math.toRadians(0), tentacle4a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle4b, tentacle4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-220))*3), tentacle4b.rotateAngleY + (float) Math.toRadians(0), tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle5a, tentacle5a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*1), tentacle5a.rotateAngleY + (float) Math.toRadians(0), tentacle5a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle5b, tentacle5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*2), tentacle5b.rotateAngleY + (float) Math.toRadians(0), tentacle5b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle6a, tentacle6a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*-0.5), tentacle6a.rotateAngleY + (float) Math.toRadians(0), tentacle6a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-100))*-1), tentacle6b.rotateAngleY + (float) Math.toRadians(0), tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle7a, tentacle7a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*-3), tentacle7a.rotateAngleY + (float) Math.toRadians(0), tentacle7a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle7b, tentacle7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*-4), tentacle7b.rotateAngleY + (float) Math.toRadians(0), tentacle7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle7c, tentacle7c.rotateAngleX + (float) Math.toRadians(-17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*-12), tentacle7c.rotateAngleY + (float) Math.toRadians(0), tentacle7c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle7d, tentacle7d.rotateAngleX + (float) Math.toRadians(-33.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-210))*-15), tentacle7d.rotateAngleY + (float) Math.toRadians(0), tentacle7d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle8a, tentacle8a.rotateAngleX + (float) Math.toRadians(0), tentacle8a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*1), tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle8b, tentacle8b.rotateAngleX + (float) Math.toRadians(0), tentacle8b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-250))*2), tentacle8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle9a, tentacle9a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-80))*1), tentacle9a.rotateAngleY + (float) Math.toRadians(0), tentacle9a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle9b, tentacle9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-180))*2), tentacle9b.rotateAngleY + (float) Math.toRadians(0), tentacle9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle10a, tentacle10a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-50))*0.5), tentacle10a.rotateAngleY + (float) Math.toRadians(0), tentacle10a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle10b, tentacle10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-100))*1), tentacle10b.rotateAngleY + (float) Math.toRadians(0), tentacle10b.rotateAngleZ + (float) Math.toRadians(0));
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*0.04),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*0.02),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*0.03));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTropaeum entity = (EntityPrehistoricFloraTropaeum) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1.5), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.5), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*0.6);
        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*0.5), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*0.01));
        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(-13.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-10), tentacle1a.rotateAngleY + (float) Math.toRadians(0), tentacle1a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-20), tentacle1b.rotateAngleY + (float) Math.toRadians(0), tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle2a, tentacle2a.rotateAngleX + (float) Math.toRadians(-7.7906+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-10), tentacle2a.rotateAngleY + (float) Math.toRadians(11.77703), tentacle2a.rotateAngleZ + (float) Math.toRadians(31.50681));
        this.setRotateAngle(tentacle2b, tentacle2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-20), tentacle2b.rotateAngleY + (float) Math.toRadians(0), tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle2c, tentacle2c.rotateAngleX + (float) Math.toRadians(-17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-35), tentacle2c.rotateAngleY + (float) Math.toRadians(0), tentacle2c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle2d, tentacle2d.rotateAngleX + (float) Math.toRadians(-33.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-210))*-45), tentacle2d.rotateAngleY + (float) Math.toRadians(0), tentacle2d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle3a, tentacle3a.rotateAngleX + (float) Math.toRadians(0), tentacle3a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-10), tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle3b, tentacle3b.rotateAngleX + (float) Math.toRadians(0), tentacle3b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-20), tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle4a, tentacle4a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*10), tentacle4a.rotateAngleY + (float) Math.toRadians(0), tentacle4a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle4b, tentacle4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*20), tentacle4b.rotateAngleY + (float) Math.toRadians(0), tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle5a, tentacle5a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*10), tentacle5a.rotateAngleY + (float) Math.toRadians(0), tentacle5a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle5b, tentacle5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*20), tentacle5b.rotateAngleY + (float) Math.toRadians(0), tentacle5b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle6a, tentacle6a.rotateAngleX + (float) Math.toRadians(-13.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-10), tentacle6a.rotateAngleY + (float) Math.toRadians(0), tentacle6a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-20), tentacle6b.rotateAngleY + (float) Math.toRadians(0), tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle7a, tentacle7a.rotateAngleX + (float) Math.toRadians(-7.7906+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-10), tentacle7a.rotateAngleY + (float) Math.toRadians(-11.777), tentacle7a.rotateAngleZ + (float) Math.toRadians(-31.5068));
        this.setRotateAngle(tentacle7b, tentacle7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-20), tentacle7b.rotateAngleY + (float) Math.toRadians(0), tentacle7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle7c, tentacle7c.rotateAngleX + (float) Math.toRadians(-17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-35), tentacle7c.rotateAngleY + (float) Math.toRadians(0), tentacle7c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle7d, tentacle7d.rotateAngleX + (float) Math.toRadians(-33.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-210))*-45), tentacle7d.rotateAngleY + (float) Math.toRadians(0), tentacle7d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle8a, tentacle8a.rotateAngleX + (float) Math.toRadians(0), tentacle8a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*10), tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle8b, tentacle8b.rotateAngleX + (float) Math.toRadians(0), tentacle8b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*20), tentacle8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle9a, tentacle9a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*10), tentacle9a.rotateAngleY + (float) Math.toRadians(0), tentacle9a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle9b, tentacle9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*20), tentacle9b.rotateAngleY + (float) Math.toRadians(0), tentacle9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle10a, tentacle10a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*10), tentacle10a.rotateAngleY + (float) Math.toRadians(0), tentacle10a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tentacle10b, tentacle10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*20), tentacle10b.rotateAngleY + (float) Math.toRadians(0), tentacle10b.rotateAngleZ + (float) Math.toRadians(0));
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.04),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.03));

    }



    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraTropaeum ee = (EntityPrehistoricFloraTropaeum) e;

        if (!e.isInWater()) {
            this.Root.rotateAngleZ = (float) Math.toRadians(90);
            this.Root.offsetY = 0.7F;
            this.Root.offsetZ = 0.5F;
            this.Root.offsetX = 0.2F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

