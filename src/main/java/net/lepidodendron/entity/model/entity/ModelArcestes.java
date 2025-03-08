package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArcestes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArcestes extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Shell1;
    private final AdvancedModelRendererExtended shellround1;
    private final AdvancedModelRendererExtended shellround2;
    private final AdvancedModelRendererExtended shellround3;
    private final AdvancedModelRendererExtended shellround4;
    private final AdvancedModelRendererExtended shellround5;
    private final AdvancedModelRendererExtended shellround11;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended shellround6;
    private final AdvancedModelRendererExtended shellround7;
    private final AdvancedModelRendererExtended shellround8;
    private final AdvancedModelRendererExtended shellround9;
    private final AdvancedModelRendererExtended shellround10;
    private final AdvancedModelRendererExtended shellround12;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended Shellaperture;
    private final AdvancedModelRendererExtended Shell2;
    private final AdvancedModelRendererExtended Shell3;
    private final AdvancedModelRendererExtended Shell4;
    private final AdvancedModelRendererExtended Shell5;
    private final AdvancedModelRendererExtended Shell6;
    private final AdvancedModelRendererExtended Shell7;
    private final AdvancedModelRendererExtended Shell8;
    private final AdvancedModelRendererExtended Shell9;
    private final AdvancedModelRendererExtended Shell10;
    private final AdvancedModelRendererExtended shellfront1;
    private final AdvancedModelRendererExtended Mantle;
    private final AdvancedModelRendererExtended Siphon;
    private final AdvancedModelRendererExtended eyeRight;
    private final AdvancedModelRendererExtended Mantle_r1;
    private final AdvancedModelRendererExtended eyeLeft;
    private final AdvancedModelRendererExtended Mantle_r2;
    private final AdvancedModelRendererExtended Leg1right;
    private final AdvancedModelRendererExtended Leg2right;
    private final AdvancedModelRendererExtended Leg3right;
    private final AdvancedModelRendererExtended Leg4right;
    private final AdvancedModelRendererExtended Leg5right;
    private final AdvancedModelRendererExtended Leg1left;
    private final AdvancedModelRendererExtended Leg2left;
    private final AdvancedModelRendererExtended Leg3left;
    private final AdvancedModelRendererExtended Leg4left;
    private final AdvancedModelRendererExtended Leg5left;
    private final AdvancedModelRendererExtended Arm1right;
    private final AdvancedModelRendererExtended Arm1right3;
    private final AdvancedModelRendererExtended Arm1right4;
    private final AdvancedModelRendererExtended Arm1right5;
    private final AdvancedModelRendererExtended Arm1left;
    private final AdvancedModelRendererExtended Arm1left3;
    private final AdvancedModelRendererExtended Arm1left4;
    private final AdvancedModelRendererExtended Arm1left5;
    private final AdvancedModelRendererExtended Tentacle1a;
    private final AdvancedModelRendererExtended Tentacle1b;
    private final AdvancedModelRendererExtended Tentacle2a;
    private final AdvancedModelRendererExtended Tentacle2b;
    private final AdvancedModelRendererExtended Tentacle3a;
    private final AdvancedModelRendererExtended Tentacle3b;
    private final AdvancedModelRendererExtended Tentacle4a;
    private final AdvancedModelRendererExtended Tentacle4b;
    private final AdvancedModelRendererExtended Tentacle5a;
    private final AdvancedModelRendererExtended Tentacle5b;
    private final AdvancedModelRendererExtended Tentacle6a;
    private final AdvancedModelRendererExtended Tentacle6b;
    private ModelAnimator animator;


    public ModelArcestes() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 13.75F, 0.0F);
        this.setRotateAngle(root, -0.0393F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRendererExtended(this);
        this.Shell1.setRotationPoint(0.0F, 2.25F, 5.5F);
        this.root.addChild(Shell1);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 0, -5.0F, -1.0F, -9.0F, 10, 9, 6, 0.04F, false));
        this.Shell1.cubeList.add(new ModelBox(Shell1, 32, 4, -4.0F, -3.0F, -8.0F, 8, 2, 2, 0.0F, false));

        this.shellround1 = new AdvancedModelRendererExtended(this);
        this.shellround1.setRotationPoint(0.0F, 6.05F, -3.825F);
        this.Shell1.addChild(shellround1);
        this.shellround1.cubeList.add(new ModelBox(shellround1, 20, 65, 5.0F, -7.0F, -4.0F, 3, 7, 4, 0.0F, false));

        this.shellround2 = new AdvancedModelRendererExtended(this);
        this.shellround2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround1.addChild(shellround2);
        this.setRotateAngle(shellround2, -0.5672F, 0.0F, 0.0F);
        this.shellround2.cubeList.add(new ModelBox(shellround2, 34, 67, 4.5F, -6.0F, -4.0F, 3, 6, 4, 0.0F, false));

        this.shellround3 = new AdvancedModelRendererExtended(this);
        this.shellround3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround2.addChild(shellround3);
        this.setRotateAngle(shellround3, -0.6545F, 0.0F, 0.0F);
        this.shellround3.cubeList.add(new ModelBox(shellround3, 72, 34, 5.0F, -5.0F, -4.0F, 2, 5, 4, 0.0F, false));

        this.shellround4 = new AdvancedModelRendererExtended(this);
        this.shellround4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround3.addChild(shellround4);
        this.setRotateAngle(shellround4, -0.6545F, 0.0F, 0.0F);
        this.shellround4.cubeList.add(new ModelBox(shellround4, 73, 43, 4.5F, -4.0F, -4.0F, 2, 4, 4, 0.0F, false));

        this.shellround5 = new AdvancedModelRendererExtended(this);
        this.shellround5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround4.addChild(shellround5);
        this.setRotateAngle(shellround5, -0.4363F, 0.0F, 0.0F);
        this.shellround5.cubeList.add(new ModelBox(shellround5, 47, 82, 5.0F, -4.0F, -3.0F, 1, 4, 3, 0.0F, false));

        this.shellround11 = new AdvancedModelRendererExtended(this);
        this.shellround11.setRotationPoint(-0.5F, 0.0F, -3.0F);
        this.shellround5.addChild(shellround11);
        this.setRotateAngle(shellround11, -0.7418F, 0.0F, 0.0F);
        this.shellround11.cubeList.add(new ModelBox(shellround11, 19, 82, 5.0F, -4.0F, -3.0F, 1, 4, 3, 0.0F, false));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.shellround1.addChild(bone);
        this.setRotateAngle(bone, 0.7679F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 68, 65, -2.0F, -5.0F, 0.0F, 3, 5, 4, -0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-7.0F, -6.1347F, 3.8498F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 0, -8.0F, -0.7F, -1.275F, 16, 2, 2, -0.01F, false));

        this.shellround6 = new AdvancedModelRendererExtended(this);
        this.shellround6.setRotationPoint(0.0F, 6.05F, -3.825F);
        this.Shell1.addChild(shellround6);
        this.shellround6.cubeList.add(new ModelBox(shellround6, 58, 58, -8.0F, -7.0F, -4.0F, 3, 7, 4, 0.0F, false));

        this.shellround7 = new AdvancedModelRendererExtended(this);
        this.shellround7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround6.addChild(shellround7);
        this.setRotateAngle(shellround7, -0.5672F, 0.0F, 0.0F);
        this.shellround7.cubeList.add(new ModelBox(shellround7, 0, 67, -7.5F, -6.0F, -4.0F, 3, 6, 4, 0.0F, false));

        this.shellround8 = new AdvancedModelRendererExtended(this);
        this.shellround8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround7.addChild(shellround8);
        this.setRotateAngle(shellround8, -0.6545F, 0.0F, 0.0F);
        this.shellround8.cubeList.add(new ModelBox(shellround8, 72, 25, -7.0F, -5.0F, -4.0F, 2, 5, 4, 0.0F, false));

        this.shellround9 = new AdvancedModelRendererExtended(this);
        this.shellround9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround8.addChild(shellround9);
        this.setRotateAngle(shellround9, -0.6545F, 0.0F, 0.0F);
        this.shellround9.cubeList.add(new ModelBox(shellround9, 10, 73, -6.5F, -4.0F, -4.0F, 2, 4, 4, 0.0F, false));

        this.shellround10 = new AdvancedModelRendererExtended(this);
        this.shellround10.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellround9.addChild(shellround10);
        this.setRotateAngle(shellround10, -0.4363F, 0.0F, 0.0F);
        this.shellround10.cubeList.add(new ModelBox(shellround10, 81, 40, -6.0F, -4.0F, -3.0F, 1, 4, 3, 0.0F, false));

        this.shellround12 = new AdvancedModelRendererExtended(this);
        this.shellround12.setRotationPoint(0.5F, 0.0F, -3.0F);
        this.shellround10.addChild(shellround12);
        this.setRotateAngle(shellround12, -0.7418F, 0.0F, 0.0F);
        this.shellround12.cubeList.add(new ModelBox(shellround12, 39, 81, -6.0F, -4.0F, -3.0F, 1, 4, 3, 0.0F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.shellround6.addChild(bone2);
        this.setRotateAngle(bone2, 0.7679F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 48, 67, -1.0F, -5.0F, 0.0F, 3, 5, 4, -0.01F, false));

        this.Shellaperture = new AdvancedModelRendererExtended(this);
        this.Shellaperture.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.Shell1.addChild(Shellaperture);
        this.setRotateAngle(Shellaperture, 0.3927F, 0.0F, 0.0F);
        this.Shellaperture.cubeList.add(new ModelBox(Shellaperture, 0, 56, -5.0F, -7.5394F, -1.3544F, 10, 9, 2, 0.0F, false));
        this.Shellaperture.cubeList.add(new ModelBox(Shellaperture, 76, 12, 5.0F, -7.5394F, -1.3544F, 3, 7, 2, 0.01F, false));
        this.Shellaperture.cubeList.add(new ModelBox(Shellaperture, 72, 74, -8.0F, -7.5394F, -1.3544F, 3, 7, 2, 0.01F, false));

        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(0.0F, 8.0F, -9.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6545F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 15, -5.0F, -8.0F, -6.0F, 10, 8, 6, 0.01F, false));

        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.7418F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 26, 23, -5.0F, -7.0F, -6.0F, 10, 7, 6, 0.0F, false));

        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6981F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 26, 9, -5.0F, -6.0F, -6.0F, 10, 6, 6, 0.01F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.6981F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 31, -5.0F, -6.0F, -5.0F, 10, 6, 5, -0.04F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.6981F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 42, -4.5F, -6.0F, -5.0F, 9, 6, 5, 0.04F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.5672F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 52, 4, -4.5F, -6.0F, -4.0F, 9, 6, 4, 0.01F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.7418F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 51, 48, -4.5F, -6.0F, -4.0F, 9, 6, 4, 0.0F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.5672F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 23, 48, -4.5F, -5.0F, -5.0F, 9, 5, 5, -0.01F, false));

        this.Shell10 = new AdvancedModelRendererExtended(this);
        this.Shell10.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell9.addChild(Shell10);
        this.setRotateAngle(Shell10, -0.7418F, 0.0F, 0.0F);


        this.shellfront1 = new AdvancedModelRendererExtended(this);
        this.shellfront1.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.Shell1.addChild(shellfront1);
        this.setRotateAngle(shellfront1, 0.829F, 0.0F, 0.0F);
        this.shellfront1.cubeList.add(new ModelBox(shellfront1, 30, 36, -5.0F, -8.0F, 0.0F, 10, 8, 4, 0.01F, false));

        this.Mantle = new AdvancedModelRendererExtended(this);
        this.Mantle.setRotationPoint(0.0F, 0.75F, 0.1F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.1227F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 52, 21, -4.5F, -2.0F, -2.0F, 9, 5, 3, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 42, 58, 4.5F, -2.0F, -4.0F, 3, 4, 5, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 58, 0, 7.5F, -1.0F, -4.0F, 3, 0, 4, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 42, 48, -10.5F, -1.0F, -4.0F, 3, 0, 4, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 58, 38, -7.5F, -2.0F, -4.0F, 3, 4, 5, 0.0F, false));

        this.Siphon = new AdvancedModelRendererExtended(this);
        this.Siphon.setRotationPoint(0.0F, 2.075F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.3409F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 54, 32, -3.5F, 0.0F, -2.0F, 7, 2, 4, 0.0F, false));

        this.eyeRight = new AdvancedModelRendererExtended(this);
        this.eyeRight.setRotationPoint(5.975F, -2.0F, -0.5F);
        this.Mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, 0.0418F, -0.4742F, 0.0983F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 9, 81, -1.0F, -3.0F, -1.5F, 2, 3, 3, 0.0F, false));

        this.Mantle_r1 = new AdvancedModelRendererExtended(this);
        this.Mantle_r1.setRotationPoint(1.0F, -3.0F, 0.0F);
        this.eyeRight.addChild(Mantle_r1);
        this.setRotateAngle(Mantle_r1, 0.0F, 0.0F, 0.5672F);
        this.Mantle_r1.cubeList.add(new ModelBox(Mantle_r1, 0, 12, 0.0F, -3.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.eyeLeft = new AdvancedModelRendererExtended(this);
        this.eyeLeft.setRotationPoint(-5.975F, -2.0F, -0.5F);
        this.Mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, 0.0418F, 0.4742F, -0.0983F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 64, 80, -1.0F, -3.0F, -1.5F, 2, 3, 3, 0.0F, false));

        this.Mantle_r2 = new AdvancedModelRendererExtended(this);
        this.Mantle_r2.setRotationPoint(-1.0F, -3.0F, 0.0F);
        this.eyeLeft.addChild(Mantle_r2);
        this.setRotateAngle(Mantle_r2, 0.0F, 0.0F, -0.5672F);
        this.Mantle_r2.cubeList.add(new ModelBox(Mantle_r2, 0, 0, 0.0F, -3.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.Leg1right = new AdvancedModelRendererExtended(this);
        this.Leg1right.setRotationPoint(5.925F, 1.325F, 0.25F);
        this.Mantle.addChild(Leg1right);
        this.setRotateAngle(Leg1right, -0.1107F, 0.0436F, -0.0756F);
        this.Leg1right.cubeList.add(new ModelBox(Leg1right, 79, 80, -1.0F, -1.0F, -0.5F, 3, 2, 3, 0.0F, false));
        this.Leg1right.cubeList.add(new ModelBox(Leg1right, 4, 53, 2.0F, 0.0F, -0.5F, 2, 0, 3, 0.0F, false));

        this.Leg2right = new AdvancedModelRendererExtended(this);
        this.Leg2right.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Leg1right.addChild(Leg2right);
        this.setRotateAngle(Leg2right, -0.1343F, -0.0317F, 0.0923F);
        this.Leg2right.cubeList.add(new ModelBox(Leg2right, 72, 58, -1.0F, -1.0F, -0.5F, 3, 2, 4, 0.0F, false));
        this.Leg2right.cubeList.add(new ModelBox(Leg2right, 48, 4, 2.0F, 0.0F, -0.5F, 2, 0, 4, 0.0F, false));

        this.Leg3right = new AdvancedModelRendererExtended(this);
        this.Leg3right.setRotationPoint(2.0F, 0.0F, 3.5F);
        this.Leg2right.addChild(Leg3right);
        this.setRotateAngle(Leg3right, 0.0F, -1.1345F, 0.0F);
        this.Leg3right.cubeList.add(new ModelBox(Leg3right, 44, 76, -2.0F, -1.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.Leg4right = new AdvancedModelRendererExtended(this);
        this.Leg4right.setRotationPoint(-0.5F, 0.5F, 3.5F);
        this.Leg3right.addChild(Leg4right);
        this.setRotateAngle(Leg4right, -0.0475F, -0.346F, 0.1392F);
        this.Leg4right.cubeList.add(new ModelBox(Leg4right, 85, 47, -0.5F, -1.5F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Leg5right = new AdvancedModelRendererExtended(this);
        this.Leg5right.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.Leg4right.addChild(Leg5right);
        this.setRotateAngle(Leg5right, 0.0F, -0.6981F, 0.0F);
        this.Leg5right.cubeList.add(new ModelBox(Leg5right, 17, 53, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Leg1left = new AdvancedModelRendererExtended(this);
        this.Leg1left.setRotationPoint(-5.925F, 1.325F, 0.25F);
        this.Mantle.addChild(Leg1left);
        this.setRotateAngle(Leg1left, -0.1107F, -0.0436F, 0.0756F);
        this.Leg1left.cubeList.add(new ModelBox(Leg1left, 80, 21, -2.0F, -1.0F, -0.5F, 3, 2, 3, 0.0F, false));
        this.Leg1left.cubeList.add(new ModelBox(Leg1left, 0, 53, -4.0F, 0.0F, -0.5F, 2, 0, 3, 0.0F, false));

        this.Leg2left = new AdvancedModelRendererExtended(this);
        this.Leg2left.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Leg1left.addChild(Leg2left);
        this.setRotateAngle(Leg2left, -0.1343F, 0.0317F, -0.0923F);
        this.Leg2left.cubeList.add(new ModelBox(Leg2left, 58, 72, -2.0F, -1.0F, -0.5F, 3, 2, 4, 0.0F, false));
        this.Leg2left.cubeList.add(new ModelBox(Leg2left, 26, 36, -4.0F, 0.0F, -0.5F, 2, 0, 4, 0.0F, false));

        this.Leg3left = new AdvancedModelRendererExtended(this);
        this.Leg3left.setRotationPoint(-2.0F, 0.0F, 3.5F);
        this.Leg2left.addChild(Leg3left);
        this.setRotateAngle(Leg3left, 0.0F, 1.1345F, 0.0F);
        this.Leg3left.cubeList.add(new ModelBox(Leg3left, 74, 0, 0.0F, -1.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.Leg4left = new AdvancedModelRendererExtended(this);
        this.Leg4left.setRotationPoint(0.5F, 0.5F, 3.5F);
        this.Leg3left.addChild(Leg4left);
        this.setRotateAngle(Leg4left, -0.0475F, 0.346F, -0.1392F);
        this.Leg4left.cubeList.add(new ModelBox(Leg4left, 55, 84, -0.5F, -1.5F, 0.0F, 1, 2, 3, 0.0F, false));

        this.Leg5left = new AdvancedModelRendererExtended(this);
        this.Leg5left.setRotationPoint(0.0F, -0.5F, 2.5F);
        this.Leg4left.addChild(Leg5left);
        this.setRotateAngle(Leg5left, 0.0F, 0.6981F, 0.0F);
        this.Leg5left.cubeList.add(new ModelBox(Leg5left, 0, 18, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Arm1right = new AdvancedModelRendererExtended(this);
        this.Arm1right.setRotationPoint(5.45F, -0.975F, 0.5F);
        this.Mantle.addChild(Arm1right);
        this.setRotateAngle(Arm1right, -0.2618F, 0.1745F, 0.0F);
        this.Arm1right.cubeList.add(new ModelBox(Arm1right, 24, 58, -2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F, false));
        this.Arm1right.cubeList.add(new ModelBox(Arm1right, 32, 58, 2.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.Arm1right3 = new AdvancedModelRendererExtended(this);
        this.Arm1right3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Arm1right.addChild(Arm1right3);
        this.setRotateAngle(Arm1right3, 0.3054F, 0.0F, 0.0F);
        this.Arm1right3.cubeList.add(new ModelBox(Arm1right3, 80, 71, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.Arm1right4 = new AdvancedModelRendererExtended(this);
        this.Arm1right4.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Arm1right3.addChild(Arm1right4);
        this.setRotateAngle(Arm1right4, 0.1329F, -0.173F, -0.023F);
        this.Arm1right4.cubeList.add(new ModelBox(Arm1right4, 30, 65, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Arm1right5 = new AdvancedModelRendererExtended(this);
        this.Arm1right5.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.Arm1right4.addChild(Arm1right5);
        this.setRotateAngle(Arm1right5, -0.3491F, 0.0F, 0.0F);
        this.Arm1right5.cubeList.add(new ModelBox(Arm1right5, 11, 53, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Arm1left = new AdvancedModelRendererExtended(this);
        this.Arm1left.setRotationPoint(-5.45F, -0.975F, 0.5F);
        this.Mantle.addChild(Arm1left);
        this.setRotateAngle(Arm1left, -0.2618F, -0.1745F, 0.0F);
        this.Arm1left.cubeList.add(new ModelBox(Arm1left, 58, 14, -2.0F, -1.0F, 0.0F, 4, 2, 5, 0.0F, false));
        this.Arm1left.cubeList.add(new ModelBox(Arm1left, 18, 42, -5.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.Arm1left3 = new AdvancedModelRendererExtended(this);
        this.Arm1left3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Arm1left.addChild(Arm1left3);
        this.setRotateAngle(Arm1left3, 0.3054F, 0.0F, 0.0F);
        this.Arm1left3.cubeList.add(new ModelBox(Arm1left3, 78, 64, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.Arm1left4 = new AdvancedModelRendererExtended(this);
        this.Arm1left4.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Arm1left3.addChild(Arm1left4);
        this.setRotateAngle(Arm1left4, 0.1329F, 0.173F, 0.023F);
        this.Arm1left4.cubeList.add(new ModelBox(Arm1left4, 53, 58, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Arm1left5 = new AdvancedModelRendererExtended(this);
        this.Arm1left5.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.Arm1left4.addChild(Arm1left5);
        this.setRotateAngle(Arm1left5, -0.3491F, 0.0F, 0.0F);
        this.Arm1left5.cubeList.add(new ModelBox(Arm1left5, 0, 0, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRendererExtended(this);
        this.Tentacle1a.setRotationPoint(-1.375F, 1.5F, 0.5F);
        this.Mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.2625F, -0.0859F, 0.0152F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 77, 51, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRendererExtended(this);
        this.Tentacle1b.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.6109F, 0.0F, 0.0F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 71, 83, -1.0F, 0.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.Tentacle2a = new AdvancedModelRendererExtended(this);
        this.Tentacle2a.setRotationPoint(-3.0F, 0.5F, 0.5F);
        this.Mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.2233F, -0.2129F, 0.0479F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 22, 76, -0.75F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRendererExtended(this);
        this.Tentacle2b.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, -0.6545F, 0.0F, 0.0F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 81, 31, -0.75F, 0.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.Tentacle3a = new AdvancedModelRendererExtended(this);
        this.Tentacle3a.setRotationPoint(-1.125F, -0.875F, 0.5F);
        this.Mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.2319F, -0.0859F, 0.0152F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 0, 77, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRendererExtended(this);
        this.Tentacle3b.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.336F, 0.0F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 82, 57, -1.0F, 0.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.Tentacle4a = new AdvancedModelRendererExtended(this);
        this.Tentacle4a.setRotationPoint(1.375F, 1.5F, 0.5F);
        this.Mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.2625F, 0.0859F, -0.0152F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 30, 78, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRendererExtended(this);
        this.Tentacle4b.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.6109F, 0.0F, 0.0F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 84, 26, -1.0F, 0.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.Tentacle5a = new AdvancedModelRendererExtended(this);
        this.Tentacle5a.setRotationPoint(3.0F, 0.5F, 0.5F);
        this.Mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.2233F, 0.2129F, -0.0479F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 22, 76, -1.25F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.Tentacle5b = new AdvancedModelRendererExtended(this);
        this.Tentacle5b.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.6545F, 0.0F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 81, 31, -1.25F, 0.0F, 0.0F, 2, 2, 3, -0.01F, true));

        this.Tentacle6a = new AdvancedModelRendererExtended(this);
        this.Tentacle6a.setRotationPoint(1.125F, -0.875F, 0.5F);
        this.Mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.2319F, 0.0859F, -0.0152F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 78, 6, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRendererExtended(this);
        this.Tentacle6b.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.336F, 0.0F, 0.0F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 0, 84, -1.0F, 0.0F, 0.0F, 2, 2, 3, -0.01F, false));

        //Swim pose is the default:
//        this.Body.rotateAngleY = (float) Math.toRadians(180);
//        this.Body.rotateAngleX = (float) Math.toRadians(0);
        this.setRotateAngle(Arm1left, -0.2618F, -0.1745F, 0.0F);
        this.setRotateAngle(Arm1left3, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(Arm1left4, 0.1329F, 0.173F, 0.023F);
        this.setRotateAngle(Arm1left5, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Arm1right, -0.2618F, 0.1745F, 0.0F);
        this.setRotateAngle(Arm1right3, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(Arm1right4, 0.1329F, -0.173F, -0.023F);
        this.setRotateAngle(Arm1right5, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(bone, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(bone2, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(eyeLeft, 0.0418F, 0.4742F, -0.0983F);
        this.setRotateAngle(eyeRight, 0.0418F, -0.4742F, 0.0983F);
        this.setRotateAngle(Leg1left, -0.1107F, -0.0436F, 0.0756F);
        this.setRotateAngle(Leg1right, -0.1107F, 0.0436F, -0.0756F);
        this.setRotateAngle(Leg2left, -0.1343F, 0.0317F, -0.0923F);
        this.setRotateAngle(Leg2right, -0.1343F, -0.0317F, 0.0923F);
        this.setRotateAngle(Leg3left, 0.0F, 1.1345F, 0.0F);
        this.setRotateAngle(Leg3right, 0.0F, -1.1345F, 0.0F);
        this.setRotateAngle(Leg4left, -0.0475F, 0.346F, -0.1392F);
        this.setRotateAngle(Leg4right, -0.0475F, -0.346F, 0.1392F);
        this.setRotateAngle(Leg5left, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(Leg5right, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(Mantle_r1, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(Mantle_r2, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(Mantle, -0.1227F, 0.0F, 0.0F);
        this.setRotateAngle(root, -0.0393F, 0.0F, 0.0F);
        this.setRotateAngle(Shell10, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(Shell2, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Shell3, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(Shell4, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(Shell5, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(Shell6, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(Shell7, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(Shell8, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(Shell9, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(Shellaperture, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(shellfront1, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(shellround10, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(shellround11, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(shellround12, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(shellround2, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(shellround3, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(shellround4, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(shellround5, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(shellround7, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(shellround8, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(shellround9, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Siphon, -0.3409F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle1a, -0.2625F, -0.0859F, 0.0152F);
        this.setRotateAngle(Tentacle1b, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle2a, -0.2233F, -0.2129F, 0.0479F);
        this.setRotateAngle(Tentacle2b, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle3a, -0.2319F, -0.0859F, 0.0152F);
        this.setRotateAngle(Tentacle3b, -0.336F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle4a, -0.2625F, 0.0859F, -0.0152F);
        this.setRotateAngle(Tentacle4b, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle5a, -0.2233F, 0.2129F, -0.0479F);
        this.setRotateAngle(Tentacle5b, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle6a, -0.2319F, 0.0859F, -0.0152F);
        this.setRotateAngle(Tentacle6b, -0.336F, 0.0F, 0.0F);

        updateDefaultPose();
        animator = ModelAnimator.create();

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Leg1left, -0.7F, -0.3F, 0.0F);
        this.setRotateAngle(Leg2left, -0.3F, 0.1F, 0.0F);
        this.setRotateAngle(Leg3left, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(Leg4left, -0.0F, 1.5F, 0.0F);
        this.setRotateAngle(Leg1right, -1.5F, 0.3F, -0.4F);
        this.setRotateAngle(Leg2right, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(Leg3right, 0.0F, -0.8F, 0.0F);
        this.setRotateAngle(Leg4right, 0.0F, -0.8F, 0.0F);
        this.root.offsetY = 0.175F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(root, -0.4F, 0.2F, -0.3F);
        this.setRotateAngle(Leg1left, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Leg2left, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Leg3left, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Leg4left, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Leg5left, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(Leg1right, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Leg2right, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Leg3right, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Leg4right, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Leg5right, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(Tentacle1a, 0.2F, 0.1F, 3.2F);
        this.setRotateAngle(Tentacle1b, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle2a, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tentacle2b, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle3a, 0.2F, -0.1F, 0.0F);
        this.setRotateAngle(Tentacle3b, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle4a, 0.2F, 0.1F, 3.0F);
        this.setRotateAngle(Tentacle4b, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle5a, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tentacle5b, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tentacle6a, 0.2F, 0.1F, 0.0F);
        this.setRotateAngle(Tentacle6b, 0.0F, 0.0F, 0.0F);
        this.root.offsetY = -0.2F;
        this.root.offsetX = 0.01F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -0.338F;
        this.root.rotateAngleY = (float)Math.toRadians(40);
        this.root.rotateAngleX = (float)Math.toRadians(-28);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.Body.offsetY = -0.5F;

        //this.body.offsetZ = -1F;
        EntityPrehistoricFloraArcestes prot = (EntityPrehistoricFloraArcestes) e;

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        if (prot.isReallySwimming()) {



            if (e.isInWater()) {
                float bobSpeed = 0.1F;
                this.bob(root, bobSpeed, 0.8F, false, f2, 2);
                this.root.offsetZ = this.moveBoxExtended(speed, 0.35F, false, 1F, f2, 1);
            } else {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
            }
        } else {

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraArcestes ee = (EntityPrehistoricFloraArcestes) entitylivingbaseIn;
            //Swimming pose:

        if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
            //Walk pose:
            this.root.rotateAngleY = (float) Math.toRadians(180);
            this.setRotateAngle(Arm1left, -0.2618F, -0.1745F, 0.0F);
            this.setRotateAngle(Arm1left3, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(Arm1left4, 0.1329F, 0.173F, 0.023F);
            this.setRotateAngle(Arm1left5, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(Arm1right, -0.2618F, 0.1745F, 0.0F);
            this.setRotateAngle(Arm1right3, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(Arm1right4, 0.1329F, -0.173F, -0.023F);
            this.setRotateAngle(Arm1right5, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(bone, 0.7679F, 0.0F, 0.0F);
            this.setRotateAngle(bone2, 0.7679F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(eyeLeft, 0.0418F, 0.4742F, -0.0983F);
            this.setRotateAngle(eyeRight, 0.0418F, -0.4742F, 0.0983F);
            this.setRotateAngle(Leg1left, -1.0488F, -0.0436F, 0.0756F);
            this.setRotateAngle(Leg1right, -1.0488F, 0.0436F, -0.0756F);
            this.setRotateAngle(Leg2left, -0.1348F, 0.0922F, -0.1005F);
            this.setRotateAngle(Leg2right, -0.1348F, -0.0966F, 0.1011F);
            this.setRotateAngle(Leg3left, 0.0F, 1.2872F, 0.0F);
            this.setRotateAngle(Leg3right, 0.0F, -1.2872F, 0.0F);
            this.setRotateAngle(Leg4left, -0.0475F, 0.346F, -0.1392F);
            this.setRotateAngle(Leg4right, -0.0475F, -0.346F, 0.1392F);
            this.setRotateAngle(Leg5left, 0.0F, 0.6981F, 0.0F);
            this.setRotateAngle(Leg5right, 0.0F, -0.6981F, 0.0F);
            this.setRotateAngle(Mantle_r1, 0.0F, 0.0F, 0.5672F);
            this.setRotateAngle(Mantle_r2, 0.0F, 0.0F, -0.5672F);
            this.setRotateAngle(Mantle, -0.1227F, 0.0F, 0.0F);
            this.setRotateAngle(Shell1, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(Shell10, -0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(Shell2, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(Shell3, -0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(Shell4, -0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(Shell5, -0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(Shell6, -0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(Shell7, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(Shell8, -0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(Shell9, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(Shellaperture, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(shellfront1, 0.829F, 0.0F, 0.0F);
            this.setRotateAngle(shellround10, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(shellround11, -0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(shellround12, -0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(shellround2, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(shellround3, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(shellround4, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(shellround5, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(shellround7, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(shellround8, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(shellround9, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(Siphon, -0.3409F, 0.0F, 0.0F);
            this.setRotateAngle(Tentacle1a, -0.2625F, -0.0859F, 0.0152F);
            this.setRotateAngle(Tentacle1b, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(Tentacle2a, -0.2233F, -0.2129F, 0.0479F);
            this.setRotateAngle(Tentacle2b, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(Tentacle3a, -0.2319F, -0.0859F, 0.0152F);
            this.setRotateAngle(Tentacle3b, -0.336F, 0.0F, 0.0F);
            this.setRotateAngle(Tentacle4a, -0.2625F, 0.0859F, -0.0152F);
            this.setRotateAngle(Tentacle4b, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(Tentacle5a, -0.2233F, 0.2129F, -0.0479F);
            this.setRotateAngle(Tentacle5b, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(Tentacle6a, -0.2319F, 0.0859F, -0.0152F);
            this.setRotateAngle(Tentacle6b, -0.336F, 0.0F, 0.0F);

            if (ee.isInWater()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getIsMoving());
            }


        } else {
            //Swimming
            animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraArcestes entity = (EntityPrehistoricFloraArcestes) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Shell1, Shell1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*-0.5), Shell1.rotateAngleY + (float) Math.toRadians(0), Shell1.rotateAngleZ + (float) Math.toRadians(0));
        this.Shell1.rotationPointX = this.Shell1.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.2);
        this.Shell1.rotationPointY = this.Shell1.rotationPointY - (float)(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.1);
        this.Shell1.rotationPointZ = this.Shell1.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.2);


        this.eyeRight.rotationPointX = this.eyeRight.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);
        this.eyeRight.rotationPointY = this.eyeRight.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);
        this.eyeRight.rotationPointZ = this.eyeRight.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);


        this.eyeLeft.rotationPointX = this.eyeLeft.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);
        this.eyeLeft.rotationPointY = this.eyeLeft.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);
        this.eyeLeft.rotationPointZ = this.eyeLeft.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -21.71131 + (((tickAnim - 0) / 5) * (-15.23818-(-21.71131)));
            yy = 17.16178 + (((tickAnim - 0) / 5) * (21.50945-(17.16178)));
            zz = -24.702 + (((tickAnim - 0) / 5) * (-31.14978-(-24.702)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -15.23818 + (((tickAnim - 5) / 10) * (10.43326-(-15.23818)));
            yy = 21.50945 + (((tickAnim - 5) / 10) * (-4.61516-(21.50945)));
            zz = -31.14978 + (((tickAnim - 5) / 10) * (3.89791-(-31.14978)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.43326 + (((tickAnim - 15) / 5) * (22.78579-(10.43326)));
            yy = -4.61516 + (((tickAnim - 15) / 5) * (-5.5526-(-4.61516)));
            zz = 3.89791 + (((tickAnim - 15) / 5) * (7.09963-(3.89791)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 22.78579 + (((tickAnim - 20) / 20) * (-21.71131-(22.78579)));
            yy = -5.5526 + (((tickAnim - 20) / 20) * (17.16178-(-5.5526)));
            zz = 7.09963 + (((tickAnim - 20) / 20) * (-24.702-(7.09963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg1right, Leg1right.rotateAngleX + (float) Math.toRadians(xx), Leg1right.rotateAngleY + (float) Math.toRadians(yy), Leg1right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.16423 + (((tickAnim - 0) / 5) * (5.89693-(-20.16423)));
            yy = -4.42453 + (((tickAnim - 0) / 5) * (-6.92331-(-4.42453)));
            zz = 2.33521 + (((tickAnim - 0) / 5) * (2.41401-(2.33521)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 5.89693 + (((tickAnim - 5) / 8) * (20.76023-(5.89693)));
            yy = -6.92331 + (((tickAnim - 5) / 8) * (-5.42404-(-6.92331)));
            zz = 2.41401 + (((tickAnim - 5) / 8) * (2.36673-(2.41401)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.76023 + (((tickAnim - 13) / 5) * (9.83577-(20.76023)));
            yy = -5.42404 + (((tickAnim - 13) / 5) * (-4.42453-(-5.42404)));
            zz = 2.36673 + (((tickAnim - 13) / 5) * (2.33521-(2.36673)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.83577 + (((tickAnim - 18) / 2) * (-0.16423-(9.83577)));
            yy = -4.42453 + (((tickAnim - 18) / 2) * (-4.42453-(-4.42453)));
            zz = 2.33521 + (((tickAnim - 18) / 2) * (2.33521-(2.33521)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.16423 + (((tickAnim - 20) / 5) * (4.911-(-0.16423)));
            yy = -4.42453 + (((tickAnim - 20) / 5) * (2.88904-(-4.42453)));
            zz = 2.33521 + (((tickAnim - 20) / 5) * (0.67052-(2.33521)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 4.911 + (((tickAnim - 25) / 15) * (-20.16423-(4.911)));
            yy = 2.88904 + (((tickAnim - 25) / 15) * (-4.42453-(2.88904)));
            zz = 0.67052 + (((tickAnim - 25) / 15) * (2.33521-(0.67052)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg2right, Leg2right.rotateAngleX + (float) Math.toRadians(xx), Leg2right.rotateAngleY + (float) Math.toRadians(yy), Leg2right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 0) / 5) * (19.67877-(20)));
            yy = 2 + (((tickAnim - 0) / 5) * (7.59936-(2)));
            zz = -7.5 + (((tickAnim - 0) / 5) * (-6.67508-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 19.67877 + (((tickAnim - 5) / 8) * (12.99148-(19.67877)));
            yy = 7.59936 + (((tickAnim - 5) / 8) * (35.19476-(7.59936)));
            zz = -6.67508 + (((tickAnim - 5) / 8) * (3.00981-(-6.67508)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 12.99148 + (((tickAnim - 13) / 7) * (-5.94735-(12.99148)));
            yy = 35.19476 + (((tickAnim - 13) / 7) * (55.70018-(35.19476)));
            zz = 3.00981 + (((tickAnim - 13) / 7) * (8.99299-(3.00981)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5.94735 + (((tickAnim - 20) / 5) * (-5.63275-(-5.94735)));
            yy = 55.70018 + (((tickAnim - 20) / 5) * (25.71971-(55.70018)));
            zz = 8.99299 + (((tickAnim - 20) / 5) * (3.42419-(8.99299)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -5.63275 + (((tickAnim - 25) / 5) * (9.54378-(-5.63275)));
            yy = 25.71971 + (((tickAnim - 25) / 5) * (16.55323-(25.71971)));
            zz = 3.42419 + (((tickAnim - 25) / 5) * (-2.07475-(3.42419)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 9.54378 + (((tickAnim - 30) / 5) * (15.78371-(9.54378)));
            yy = 16.55323 + (((tickAnim - 30) / 5) * (6.86485-(16.55323)));
            zz = -2.07475 + (((tickAnim - 30) / 5) * (-5.99452-(-2.07475)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15.78371 + (((tickAnim - 35) / 5) * (20-(15.78371)));
            yy = 6.86485 + (((tickAnim - 35) / 5) * (2-(6.86485)));
            zz = -5.99452 + (((tickAnim - 35) / 5) * (-7.5-(-5.99452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg3right, Leg3right.rotateAngleX + (float) Math.toRadians(xx), Leg3right.rotateAngleY + (float) Math.toRadians(yy), Leg3right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27.01122 + (((tickAnim - 0) / 5) * (-51.80722-(-27.01122)));
            yy = -31.00693 + (((tickAnim - 0) / 5) * (-38.75277-(-31.00693)));
            zz = -3.6429 + (((tickAnim - 0) / 5) * (30.28519-(-3.6429)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = -51.80722 + (((tickAnim - 5) / 13) * (-52.79792-(-51.80722)));
            yy = -38.75277 + (((tickAnim - 5) / 13) * (-21.97738-(-38.75277)));
            zz = 30.28519 + (((tickAnim - 5) / 13) * (37.31085-(30.28519)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -52.79792 + (((tickAnim - 18) / 2) * (-56.29455-(-52.79792)));
            yy = -21.97738 + (((tickAnim - 18) / 2) * (-20.70841-(-21.97738)));
            zz = 37.31085 + (((tickAnim - 18) / 2) * (42.97882-(37.31085)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -56.29455 + (((tickAnim - 20) / 5) * (-50.39642-(-56.29455)));
            yy = -20.70841 + (((tickAnim - 20) / 5) * (-22.11244-(-20.70841)));
            zz = 42.97882 + (((tickAnim - 20) / 5) * (33.65977-(42.97882)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -50.39642 + (((tickAnim - 25) / 5) * (-44.8297-(-50.39642)));
            yy = -22.11244 + (((tickAnim - 25) / 5) * (-24.65503-(-22.11244)));
            zz = 33.65977 + (((tickAnim - 25) / 5) * (24.63376-(33.65977)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -44.8297 + (((tickAnim - 30) / 10) * (-27.01122-(-44.8297)));
            yy = -24.65503 + (((tickAnim - 30) / 10) * (-31.00693-(-24.65503)));
            zz = 24.63376 + (((tickAnim - 30) / 10) * (-3.6429-(24.63376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg4right, Leg4right.rotateAngleX + (float) Math.toRadians(xx), Leg4right.rotateAngleY + (float) Math.toRadians(yy), Leg4right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -42.5 + (((tickAnim - 0) / 18) * (-7.62719-(-42.5)));
            yy = 37.5 + (((tickAnim - 0) / 18) * (-21.15855-(37.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.84745-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -7.62719 + (((tickAnim - 18) / 2) * (0-(-7.62719)));
            yy = -21.15855 + (((tickAnim - 18) / 2) * (-12.5-(-21.15855)));
            zz = 2.84745 + (((tickAnim - 18) / 2) * (0-(2.84745)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-42.5-(0)));
            yy = -12.5 + (((tickAnim - 20) / 20) * (37.5-(-12.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg5right, Leg5right.rotateAngleX + (float) Math.toRadians(xx), Leg5right.rotateAngleY + (float) Math.toRadians(yy), Leg5right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 18.78579 + (((tickAnim - 0) / 20) * (-16.59598-(18.78579)));
            yy = 5.5526 + (((tickAnim - 0) / 20) * (-14.2026-(5.5526)));
            zz = -7.0996 + (((tickAnim - 0) / 20) * (24.8869-(-7.0996)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -16.59598 + (((tickAnim - 20) / 5) * (-15.23818-(-16.59598)));
            yy = -14.2026 + (((tickAnim - 20) / 5) * (-21.5094-(-14.2026)));
            zz = 24.8869 + (((tickAnim - 20) / 5) * (28.3998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15-(24.8869)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -15.23818 + (((tickAnim - 25) / 10) * (10.43326-(-15.23818)));
            yy = -21.5094 + (((tickAnim - 25) / 10) * (4.6152-(-21.5094)));
            zz = 28.3998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15 + (((tickAnim - 25) / 10) * (-3.8979-(28.3998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10.43326 + (((tickAnim - 35) / 5) * (18.78579-(10.43326)));
            yy = 4.6152 + (((tickAnim - 35) / 5) * (5.5526-(4.6152)));
            zz = -3.8979 + (((tickAnim - 35) / 5) * (-7.0996-(-3.8979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg1left, Leg1left.rotateAngleX + (float) Math.toRadians(xx), Leg1left.rotateAngleY + (float) Math.toRadians(yy), Leg1left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.16423 + (((tickAnim - 0) / 5) * (4.911-(-0.16423)));
            yy = -4.42453 + (((tickAnim - 0) / 5) * (2.88904-(-4.42453)));
            zz = 2.33521 + (((tickAnim - 0) / 5) * (0.67052-(2.33521)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 4.911 + (((tickAnim - 5) / 15) * (-20.16423-(4.911)));
            yy = 2.88904 + (((tickAnim - 5) / 15) * (-4.42453-(2.88904)));
            zz = 0.67052 + (((tickAnim - 5) / 15) * (11.71021-(0.67052)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -20.16423 + (((tickAnim - 20) / 5) * (5.89693-(-20.16423)));
            yy = -4.42453 + (((tickAnim - 20) / 5) * (-6.92331-(-4.42453)));
            zz = 11.71021 + (((tickAnim - 20) / 5) * (2.41401-(11.71021)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 5.89693 + (((tickAnim - 25) / 8) * (20.76023-(5.89693)));
            yy = -6.92331 + (((tickAnim - 25) / 8) * (-5.42404-(-6.92331)));
            zz = 2.41401 + (((tickAnim - 25) / 8) * (2.36673-(2.41401)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 20.76023 + (((tickAnim - 33) / 5) * (9.83577-(20.76023)));
            yy = -5.42404 + (((tickAnim - 33) / 5) * (-4.42453-(-5.42404)));
            zz = 2.36673 + (((tickAnim - 33) / 5) * (2.33521-(2.36673)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 9.83577 + (((tickAnim - 38) / 2) * (-0.16423-(9.83577)));
            yy = -4.42453 + (((tickAnim - 38) / 2) * (-4.42453-(-4.42453)));
            zz = 2.33521 + (((tickAnim - 38) / 2) * (2.33521-(2.33521)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg2left, Leg2left.rotateAngleX + (float) Math.toRadians(xx), Leg2left.rotateAngleY + (float) Math.toRadians(yy), Leg2left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.05265 + (((tickAnim - 0) / 5) * (2.57597-(9.05265)));
            yy = -55.7002 + (((tickAnim - 0) / 5) * (-34.9434-(-55.7002)));
            zz = -8.993 + (((tickAnim - 0) / 5) * (-3.1041-(-8.993)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.57597 + (((tickAnim - 5) / 5) * (10.32307-(2.57597)));
            yy = -34.9434 + (((tickAnim - 5) / 5) * (-12.85929-(-34.9434)));
            zz = -3.1041 + (((tickAnim - 5) / 5) * (3.08721-(-3.1041)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10.32307 + (((tickAnim - 10) / 5) * (22.45488-(10.32307)));
            yy = -12.85929 + (((tickAnim - 10) / 5) * (-0.85709-(-12.85929)));
            zz = 3.08721 + (((tickAnim - 10) / 5) * (9.62018-(3.08721)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.45488 + (((tickAnim - 15) / 5) * (28.14721-(22.45488)));
            yy = -0.85709 + (((tickAnim - 15) / 5) * (5.78266-(-0.85709)));
            zz = 9.62018 + (((tickAnim - 15) / 5) * (25.7099-(9.62018)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 28.14721 + (((tickAnim - 20) / 5) * (19.67877-(28.14721)));
            yy = 5.78266 + (((tickAnim - 20) / 5) * (-7.5994-(5.78266)));
            zz = 25.7099 + (((tickAnim - 20) / 5) * (6.6751-(25.7099)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19.67877 + (((tickAnim - 25) / 8) * (12.99148-(19.67877)));
            yy = -7.5994 + (((tickAnim - 25) / 8) * (-35.1948-(-7.5994)));
            zz = 6.6751 + (((tickAnim - 25) / 8) * (-3.0098-(6.6751)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 12.99148 + (((tickAnim - 33) / 7) * (9.05265-(12.99148)));
            yy = -35.1948 + (((tickAnim - 33) / 7) * (-55.7002-(-35.1948)));
            zz = -3.0098 + (((tickAnim - 33) / 7) * (-8.993-(-3.0098)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg3left, Leg3left.rotateAngleX + (float) Math.toRadians(xx), Leg3left.rotateAngleY + (float) Math.toRadians(yy), Leg3left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -56.29455 + (((tickAnim - 0) / 5) * (-50.39642-(-56.29455)));
            yy = 20.7084 + (((tickAnim - 0) / 5) * (22.1124-(20.7084)));
            zz = -42.9788 + (((tickAnim - 0) / 5) * (-33.6598-(-42.9788)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -50.39642 + (((tickAnim - 5) / 5) * (-44.8297-(-50.39642)));
            yy = 22.1124 + (((tickAnim - 5) / 5) * (24.655-(22.1124)));
            zz = -33.6598 + (((tickAnim - 5) / 5) * (-24.6338-(-33.6598)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -44.8297 + (((tickAnim - 10) / 10) * (-23.1843-(-44.8297)));
            yy = 24.655 + (((tickAnim - 10) / 10) * (24.3679-(24.655)));
            zz = -24.6338 + (((tickAnim - 10) / 10) * (8.82248-(-24.6338)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -23.1843 + (((tickAnim - 20) / 5) * (-51.80722-(-23.1843)));
            yy = 24.3679 + (((tickAnim - 20) / 5) * (38.7528-(24.3679)));
            zz = 8.82248 + (((tickAnim - 20) / 5) * (-30.2852-(8.82248)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -51.80722 + (((tickAnim - 25) / 13) * (-52.79792-(-51.80722)));
            yy = 38.7528 + (((tickAnim - 25) / 13) * (21.9774-(38.7528)));
            zz = -30.2852 + (((tickAnim - 25) / 13) * (-37.3108-(-30.2852)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -52.79792 + (((tickAnim - 38) / 2) * (-56.29455-(-52.79792)));
            yy = 21.9774 + (((tickAnim - 38) / 2) * (20.7084-(21.9774)));
            zz = -37.3108 + (((tickAnim - 38) / 2) * (-42.9788-(-37.3108)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg4left, Leg4left.rotateAngleX + (float) Math.toRadians(xx), Leg4left.rotateAngleY + (float) Math.toRadians(yy), Leg4left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-42.5-(0)));
            yy = 12.5 + (((tickAnim - 0) / 20) * (-37.5-(12.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -42.5 + (((tickAnim - 20) / 18) * (-7.62719-(-42.5)));
            yy = -37.5 + (((tickAnim - 20) / 18) * (21.1586-(-37.5)));
            zz = 0 + (((tickAnim - 20) / 18) * (-2.8474-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -7.62719 + (((tickAnim - 38) / 2) * (0-(-7.62719)));
            yy = 21.1586 + (((tickAnim - 38) / 2) * (12.5-(21.1586)));
            zz = -2.8474 + (((tickAnim - 38) / 2) * (0-(-2.8474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg5left, Leg5left.rotateAngleX + (float) Math.toRadians(xx), Leg5left.rotateAngleY + (float) Math.toRadians(yy), Leg5left.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Arm1right, Arm1right.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*-1), Arm1right.rotateAngleY + (float) Math.toRadians(0), Arm1right.rotateAngleZ + (float) Math.toRadians(-0.19456));
        this.setRotateAngle(Arm1right3, Arm1right3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), Arm1right3.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*2), Arm1right3.rotateAngleZ + (float) Math.toRadians(-0.19456));
        this.setRotateAngle(Arm1right4, Arm1right4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), Arm1right4.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*1), Arm1right4.rotateAngleZ + (float) Math.toRadians(-0.19456));
        this.setRotateAngle(Arm1right5, Arm1right5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), Arm1right5.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*10), Arm1right5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Arm1left, Arm1left.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*-1), Arm1left.rotateAngleY + (float) Math.toRadians(0), Arm1left.rotateAngleZ + (float) Math.toRadians(-0.19456));
        this.setRotateAngle(Arm1left3, Arm1left3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), Arm1left3.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-2), Arm1left3.rotateAngleZ + (float) Math.toRadians(-0.19456));
        this.setRotateAngle(Arm1left4, Arm1left4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), Arm1left4.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*1), Arm1left4.rotateAngleZ + (float) Math.toRadians(0.1946));
        this.setRotateAngle(Arm1left5, Arm1left5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), Arm1left5.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-10), Arm1left5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), Tentacle2a.rotateAngleY + (float) Math.toRadians(0), Tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), Tentacle2b.rotateAngleY + (float) Math.toRadians(0), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), Tentacle4a.rotateAngleY + (float) Math.toRadians(0), Tentacle4a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*-1), Tentacle4b.rotateAngleY + (float) Math.toRadians(0), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), Tentacle1a.rotateAngleY + (float) Math.toRadians(0), Tentacle1a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*-1), Tentacle1b.rotateAngleY + (float) Math.toRadians(0), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-1), Tentacle3a.rotateAngleY + (float) Math.toRadians(0), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1), Tentacle3b.rotateAngleY + (float) Math.toRadians(0), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-1), Tentacle6a.rotateAngleY + (float) Math.toRadians(0), Tentacle6a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1), Tentacle6b.rotateAngleY + (float) Math.toRadians(0), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), Tentacle5a.rotateAngleY + (float) Math.toRadians(0), Tentacle5a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), Tentacle5b.rotateAngleY + (float) Math.toRadians(0), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArcestes entity = (EntityPrehistoricFloraArcestes) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*15), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-80))*-25), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-155))*25));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-3.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*-5.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-60))*-3);


        this.setRotateAngle(Shell1, Shell1.rotateAngleX + (float) Math.toRadians(-9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+80))*5), Shell1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*-5), Shell1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*2));
        this.Shell1.rotationPointX = this.Shell1.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160))*-2);
        this.Shell1.rotationPointY = this.Shell1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+80))*-1);
        this.Shell1.rotationPointZ = this.Shell1.rotationPointZ + (float)(0);


        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-80))*8), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(0), eyeRight.rotateAngleY + (float) Math.toRadians(47), eyeRight.rotateAngleZ + (float) Math.toRadians(0));
        this.eyeRight.rotationPointX = this.eyeRight.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);
        this.eyeRight.rotationPointY = this.eyeRight.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*-0.2);
        this.eyeRight.rotationPointZ = this.eyeRight.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);


        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(0), eyeLeft.rotateAngleY + (float) Math.toRadians(-47), eyeLeft.rotateAngleZ + (float) Math.toRadians(0));
        this.eyeLeft.rotationPointX = this.eyeLeft.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);
        this.eyeLeft.rotationPointY = this.eyeLeft.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*-0.2);
        this.eyeLeft.rotationPointZ = this.eyeLeft.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01);


        this.setRotateAngle(Leg1right, Leg1right.rotateAngleX + (float) Math.toRadians(-9.75), Leg1right.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*15), Leg1right.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9.5 + (((tickAnim - 0) / 10) * (20.44598-(9.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-50))*-15 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-50))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-50))*-15)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 45) {
            xx = 20.44598 + (((tickAnim - 10) / 35) * (9.5-(20.44598)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-50))*-15 + (((tickAnim - 10) / 35) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-50))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-50))*-15)));
            zz = 0 + (((tickAnim - 10) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg2right, Leg2right.rotateAngleX + (float) Math.toRadians(xx), Leg2right.rotateAngleY + (float) Math.toRadians(yy), Leg2right.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Leg3right, Leg3right.rotateAngleX + (float) Math.toRadians(9.5), Leg3right.rotateAngleY + (float) Math.toRadians(44.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+50))*25), Leg3right.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.5 + (((tickAnim - 0) / 4) * (9.70853-(9.5)));
            yy = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25 + (((tickAnim - 0) / 4) * (14.7394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.7272-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 24) {
            xx = 9.70853 + (((tickAnim - 4) / 20) * (9.70853-(9.70853)));
            yy = 14.7394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25 + (((tickAnim - 4) / 20) * (14.7394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25-(14.7394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25)));
            zz = 0.7272 + (((tickAnim - 4) / 20) * (0.7272-(0.7272)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 9.70853 + (((tickAnim - 24) / 21) * (9.5-(9.70853)));
            yy = 14.7394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25 + (((tickAnim - 24) / 21) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25-(14.7394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*25)));
            zz = 0.7272 + (((tickAnim - 24) / 21) * (0-(0.7272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg4right, Leg4right.rotateAngleX + (float) Math.toRadians(xx), Leg4right.rotateAngleY + (float) Math.toRadians(yy), Leg4right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35 + (((tickAnim - 0) / 4) * (50.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35-(16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 4) / 20) * (0-(0)));
            yy = 50.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35 + (((tickAnim - 4) / 20) * (50.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35-(50.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35)));
            zz = 0 + (((tickAnim - 4) / 20) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            yy = 50.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35 + (((tickAnim - 24) / 21) * (16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35-(50.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*35)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg5right, Leg5right.rotateAngleX + (float) Math.toRadians(xx), Leg5right.rotateAngleY + (float) Math.toRadians(yy), Leg5right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -9 + (((tickAnim - 0) / 11) * (0-(-9)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*-15 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*-15)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 11) / 34) * (-9-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*-15 + (((tickAnim - 11) / 34) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*-15)));
            zz = 0 + (((tickAnim - 11) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg1left, Leg1left.rotateAngleX + (float) Math.toRadians(xx), Leg1left.rotateAngleY + (float) Math.toRadians(yy), Leg1left.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Leg2left, Leg2left.rotateAngleX + (float) Math.toRadians(10), Leg2left.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-50))*15), Leg2left.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leg3left, Leg3left.rotateAngleX + (float) Math.toRadians(0), Leg3left.rotateAngleY + (float) Math.toRadians(-44.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+50))*-25), Leg3left.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.5 + (((tickAnim - 0) / 4) * (9.70853-(9.5)));
            yy = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25 + (((tickAnim - 0) / 4) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.7272-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 24) {
            xx = 9.70853 + (((tickAnim - 4) / 20) * (9.70853-(9.70853)));
            yy = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25 + (((tickAnim - 4) / 20) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25)));
            zz = 0.7272 + (((tickAnim - 4) / 20) * (0.7272-(0.7272)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 9.70853 + (((tickAnim - 24) / 21) * (9.5-(9.70853)));
            yy = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25 + (((tickAnim - 24) / 21) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+50))*-25)));
            zz = 0.7272 + (((tickAnim - 24) / 21) * (0-(0.7272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg4left, Leg4left.rotateAngleX + (float) Math.toRadians(xx), Leg4left.rotateAngleY + (float) Math.toRadians(yy), Leg4left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35 + (((tickAnim - 0) / 4) * (-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35-(-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 4) / 20) * (0-(0)));
            yy = -16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35 + (((tickAnim - 4) / 20) * (-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35-(-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35)));
            zz = 0 + (((tickAnim - 4) / 20) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            yy = -16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35 + (((tickAnim - 24) / 21) * (-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35-(-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+100))*-35)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leg5left, Leg5left.rotateAngleX + (float) Math.toRadians(xx), Leg5left.rotateAngleY + (float) Math.toRadians(yy), Leg5left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -1.7512+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15 + (((tickAnim - 0) / 11) * (26.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15-(-1.7512+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15)));
            yy = -15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5 + (((tickAnim - 0) / 11) * (-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5-(-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5)));
            zz = 13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15 + (((tickAnim - 0) / 11) * (13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15-(13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = 26.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15 + (((tickAnim - 11) / 22) * (18.2488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15-(26.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15)));
            yy = -15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5 + (((tickAnim - 11) / 22) * (-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5-(-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5)));
            zz = 13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15 + (((tickAnim - 11) / 22) * (13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15-(13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 18.2488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15 + (((tickAnim - 33) / 4) * (24.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15-(18.2488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15)));
            yy = -15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5 + (((tickAnim - 33) / 4) * (-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5-(-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5)));
            zz = 13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15 + (((tickAnim - 33) / 4) * (13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15-(13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 24.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15 + (((tickAnim - 37) / 8) * (-1.7512+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15-(24.4988+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15)));
            yy = -15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5 + (((tickAnim - 37) / 8) * (-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5-(-15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5)));
            zz = 13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15 + (((tickAnim - 37) / 8) * (13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15-(13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Arm1right, Arm1right.rotateAngleX + (float) Math.toRadians(xx), Arm1right.rotateAngleY + (float) Math.toRadians(yy), Arm1right.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Arm1right3, Arm1right3.rotateAngleX + (float) Math.toRadians(-16.5024+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+50))*20), Arm1right3.rotateAngleY + (float) Math.toRadians(-0.06975), Arm1right3.rotateAngleZ + (float) Math.toRadians(3.99939));


        this.setRotateAngle(Arm1right4, Arm1right4.rotateAngleX + (float) Math.toRadians(-34+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5))*20), Arm1right4.rotateAngleY + (float) Math.toRadians(0), Arm1right4.rotateAngleZ + (float) Math.toRadians(6));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.7512+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15 + (((tickAnim - 0) / 13) * (21.3444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15-(1.7512+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15)));
            yy = 15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5 + (((tickAnim - 0) / 13) * (15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5-(15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5)));
            zz = -13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15 + (((tickAnim - 0) / 13) * (-13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15-(-13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 21.3444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15 + (((tickAnim - 13) / 22) * (15.0944+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15-(21.3444+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15)));
            yy = 15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5 + (((tickAnim - 13) / 22) * (15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5-(15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5)));
            zz = -13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15 + (((tickAnim - 13) / 22) * (-13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15-(-13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 15.0944+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15 + (((tickAnim - 35) / 10) * (1.7512+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15-(15.0944+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*15)));
            yy = 15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5 + (((tickAnim - 35) / 10) * (15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5-(15.7908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5+120))*5)));
            zz = -13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15 + (((tickAnim - 35) / 10) * (-13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15-(-13.0998+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-120))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Arm1left, Arm1left.rotateAngleX + (float) Math.toRadians(xx), Arm1left.rotateAngleY + (float) Math.toRadians(yy), Arm1left.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Arm1left3, Arm1left3.rotateAngleX + (float) Math.toRadians(-16.5024+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+50))*20), Arm1left3.rotateAngleY + (float) Math.toRadians(-0.06975), Arm1left3.rotateAngleZ + (float) Math.toRadians(-3.9994));


        this.setRotateAngle(Arm1left4, Arm1left4.rotateAngleX + (float) Math.toRadians(-34+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5))*20), Arm1left4.rotateAngleY + (float) Math.toRadians(0), Arm1left4.rotateAngleZ + (float) Math.toRadians(-6));


        this.setRotateAngle(Arm1right5, Arm1right5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-50))*30), Arm1right5.rotateAngleY + (float) Math.toRadians(0), Arm1right5.rotateAngleZ + (float) Math.toRadians(6));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 0) / 11) * (0.25-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            zz = 1.325 + (((tickAnim - 0) / 11) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+15))*-5-(1.325)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 13) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(0.25)));
            zz = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+15))*-5 + (((tickAnim - 11) / 13) * (1.325-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+15))*-5)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 24) / 11) * (0.25-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
            zz = 1.325 + (((tickAnim - 24) / 11) * (3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*5-(1.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 35) / 10) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0.25)));
            zz = 3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*5 + (((tickAnim - 35) / 10) * (1.325-(3.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Siphon.rotationPointX = this.Siphon.rotationPointX + (float)(xx);
        this.Siphon.rotationPointY = this.Siphon.rotationPointY - (float)(yy);
        this.Siphon.rotationPointZ = this.Siphon.rotationPointZ + (float)(zz);



        this.setRotateAngle(Arm1left5, Arm1left5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-50))*30), Arm1left5.rotateAngleY + (float) Math.toRadians(0), Arm1left5.rotateAngleZ + (float) Math.toRadians(6));


        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(37.4147+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*15), Tentacle1a.rotateAngleY + (float) Math.toRadians(4.1602), Tentacle1a.rotateAngleZ + (float) Math.toRadians(-182.468));


        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5))*35), Tentacle1b.rotateAngleY + (float) Math.toRadians(0), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle1b.rotationPointX = this.Tentacle1b.rotationPointX + (float)(0);
        this.Tentacle1b.rotationPointY = this.Tentacle1b.rotationPointY - (float)(0);
        this.Tentacle1b.rotationPointZ = this.Tentacle1b.rotationPointZ + (float)(-0.4);


        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(26.5031+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*25), Tentacle2a.rotateAngleY + (float) Math.toRadians(-5.82363), Tentacle2a.rotateAngleZ + (float) Math.toRadians(-88.3082));


        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-10))*35), Tentacle2b.rotateAngleY + (float) Math.toRadians(0), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(17.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*25), Tentacle3a.rotateAngleY + (float) Math.toRadians(0), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-10))*35), Tentacle3b.rotateAngleY + (float) Math.toRadians(0), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(37.4147+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*15), Tentacle4a.rotateAngleY + (float) Math.toRadians(-4.16017), Tentacle4a.rotateAngleZ + (float) Math.toRadians(-182.468));


        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5))*35), Tentacle4b.rotateAngleY + (float) Math.toRadians(0), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle4b.rotationPointX = this.Tentacle4b.rotationPointX + (float)(0);
        this.Tentacle4b.rotationPointY = this.Tentacle4b.rotationPointY - (float)(0);
        this.Tentacle4b.rotationPointZ = this.Tentacle4b.rotationPointZ + (float)(-0.4);


        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(26.5031+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*25), Tentacle5a.rotateAngleY + (float) Math.toRadians(-5.82363), Tentacle5a.rotateAngleZ + (float) Math.toRadians(88.30816));


        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-10))*35), Tentacle5b.rotateAngleY + (float) Math.toRadians(0), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(17.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5+120))*25), Tentacle6a.rotateAngleY + (float) Math.toRadians(0), Tentacle6a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-10))*35), Tentacle6b.rotateAngleY + (float) Math.toRadians(0), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraArcestes e = (EntityPrehistoricFloraArcestes) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.startKeyframe(e.swimTransitionLength()); //move to this keyframe over the right length

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.startKeyframe(e.unswimTransitionLength()); //move to this keyframe over the right length

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }

}
