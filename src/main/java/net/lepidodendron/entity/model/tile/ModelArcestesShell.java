package net.lepidodendron.entity.model.tile;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelArcestesShell extends AdvancedModelBaseExtended {
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

    public ModelArcestesShell() {
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

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Shell1.offsetY = -0.1F;
        this.Shell1.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
