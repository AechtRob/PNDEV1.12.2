package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCricosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCricosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer HandR;


    private final ModelAnimator animator;

    public ModelCricosaurus() {
        this.textureWidth = 40;
        this.textureHeight = 30;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 21.5F, -0.5F);
        this.Body.cubeList.add(new ModelBox(Body, 10, 22, -1.5F, -0.425F, -3.5F, 3, 3, 2, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.Body.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 22, -1.0F, -0.815F, -2.0F, 2, 2, 3, -0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.075F, -2.0F);
        this.Neck.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 26, 14, -0.5F, -0.4202F, -7.3507F, 1, 1, 4, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 27, 0, -1.0F, -0.95F, -1.975F, 2, 1, 2, -0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 13, -0.375F, -0.2452F, -7.2757F, 0, 1, 4, 0.001F, true));
        this.Head.cubeList.add(new ModelBox(Head, 0, 13, 0.375F, -0.2452F, -7.2757F, 0, 1, 4, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 27, -1.0F, -0.39F, -2.0F, 2, 1, 2, -0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 12, 0, -1.0F, -0.64F, -2.5F, 2, 1, 1, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.95F, -1.95F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 2, -0.5F, 0.0F, -1.675F, 1, 1, 1, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 9, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.4048F, -2.0507F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 27, -0.5F, -0.6F, -1.0F, 1, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.1543F, 0.5955F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.044F, -0.1264F, 0.0055F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, -0.05F, -0.3878F, -3.4231F, 1, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 0, -0.05F, -0.3878F, -4.2731F, 1, 1, 1, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.1543F, 0.5955F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.044F, 0.1264F, -0.0055F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, -0.95F, -0.3878F, -4.2731F, 1, 1, 1, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -0.95F, -0.3878F, -3.4231F, 1, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.3043F, -0.0045F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 20, 22, -0.5F, -0.3495F, -7.3462F, 1, 1, 4, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 14, 0.25F, -0.6495F, -7.2962F, 0, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 14, -0.25F, -0.6495F, -7.2962F, 0, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2005F, -1.3462F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 27, -0.5F, -0.5F, -1.825F, 1, 1, 2, -0.03F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1457F, -1.4955F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 22, -1.0F, -0.375F, -0.425F, 2, 1, 2, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 27, -0.5F, -0.4F, -1.9F, 1, 1, 2, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.6F, -1.5F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 7, -2.0F, -1.025F, 0.0F, 4, 3, 4, 0.001F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 0, -2.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.75F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 20, 9, -1.5F, -0.95F, -1.0F, 3, 2, 3, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 12, 16, -1.5F, -0.4F, -1.0F, 3, 2, 3, -0.01F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.1F, 0.775F, 0.15F);
        this.Body4.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.5902F, 0.5813F, -0.2957F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 0, 7, -0.3668F, -0.0758F, -0.5116F, 1, 2, 1, 0.0F, false));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(0.0582F, 1.7992F, 0.0384F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.6305F, -0.2442F, 0.082F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 4, 19, -0.4744F, -0.0035F, -0.442F, 1, 1, 1, 0.0F, false));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(-0.1212F, 0.8186F, 0.0926F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.2223F, -0.1395F, 0.3335F);
        this.FootL.cubeList.add(new ModelBox(FootL, 0, 0, -0.4638F, -0.0917F, -0.6164F, 1, 3, 1, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-1.1F, 0.775F, 0.15F);
        this.Body4.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.5902F, -0.5813F, 0.2957F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 0, 7, -0.6332F, -0.0758F, -0.5116F, 1, 2, 1, 0.0F, true));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-0.0582F, 1.7992F, 0.0384F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.6305F, 0.2442F, -0.082F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 4, 19, -0.5256F, -0.0035F, -0.442F, 1, 1, 1, 0.0F, true));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.1212F, 0.8186F, 0.0926F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.2223F, 0.1395F, -0.3335F);
        this.FootR.cubeList.add(new ModelBox(FootR, 0, 0, -0.5362F, -0.0917F, -0.6164F, 1, 3, 1, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.Body4.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 12, 2, -1.0F, -1.075F, -1.0F, 2, 2, 5, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 11, 9, -1.0F, -0.775F, -1.0F, 2, 2, 5, -0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.1F, 3.5F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 21, 0, -0.5F, -0.6782F, -0.4995F, 1, 1, 4, 0.02F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 20, 17, -0.5F, 0.0218F, -0.4995F, 1, 1, 4, 0.01F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2282F, 3.0005F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 5, 16, -0.5F, -0.403F, -0.5104F, 1, 1, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.372F, 4.4896F);
        this.Tail3.addChild(Tail4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.7234F, 1.3143F);
        this.Tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 5, -0.5F, -0.4F, -0.125F, 1, 1, 3, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.75F, 1.0F);
        this.Tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 9, 0.0F, -1.0F, -0.55F, 0, 3, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.75F, 1.0F);
        this.Tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6589F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 27, -0.5F, 1.375F, -0.2F, 1, 1, 2, -0.01F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.3819F, 1.2974F, -2.8623F);
        this.Body.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, -0.2182F, 0.5672F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 23, 14, -0.4813F, -0.573F, -0.0931F, 1, 1, 2, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0187F, 0.177F, 1.9069F);
        this.UpperArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.5236F, -0.3927F, -0.3054F);


        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.3819F, 1.2974F, -2.8623F);
        this.Body.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, -0.2182F, -0.5672F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 23, 14, -0.5187F, -0.573F, -0.0931F, 1, 1, 2, 0.0F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-0.0187F, 0.177F, 1.9069F);
        this.UpperArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.5236F, 0.3927F, 0.3054F);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }

    public void renderStaticWall(float f) {

        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -0.4F;
        this.Body.offsetX = 1.25F;
        this.Body.rotateAngleY = (float)Math.toRadians(200);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 1.1F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.4F, -3.0F, 0.1F);
        this.setRotateAngle(Neck, -0.3F, -0.2F, -0.0F);
        this.setRotateAngle(Head, -0.3F, -0.4F, -0.0F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, -0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(Tail, 0.2F, 0.4F, 0.1F);
        this.setRotateAngle(Tail2, 0.3F, 0.4F, 0.1F);
        this.setRotateAngle(Tail3, 0.4F, 0.7F, 0.1F);
        this.setRotateAngle(Tail4, 0.5F, 0.9F, 0.2F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.Body.offsetY = -0.10F;
        //this.Body.offsetZ = -0.4F;

        EntityPrehistoricFloraCricosaurus Dako = (EntityPrehistoricFloraCricosaurus) e;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);
        AdvancedModelRenderer[] Tail = {this.Body3, this.Body4, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        //AdvancedModelRenderer[] Torso = {this.Neckfront, this.Neckmiddlefront, this.Neckmiddlebase, this.Neckbase, this.Bodyfront};
        Dako.tailBuffer.applyChainSwingBuffer(Tail);

        //AdvancedModelRenderer[] FL = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};
        //AdvancedModelRenderer[] FR = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
        //AdvancedModelRenderer[] BL = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
        //AdvancedModelRenderer[] BR = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};

        AdvancedModelRenderer[] fishTail = {this.Body4, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] finPectoralLeft = {this.UpperArmL};
        AdvancedModelRenderer[] finPectoralRight = {this.UpperArmR};
        AdvancedModelRenderer[] finPelvicLeft = {this.UpperLegL, this.LowerLegL};
        AdvancedModelRenderer[] finPelvicRight = {this.UpperLegR, this.LowerLegR};

        if (!Dako.isReallyInWater()) { //will never happen as it should not be on land
            float speed = 0.3F;
            float outOfWater = 1.45f;
            this.Body.offsetY = -0.05F;

            this.Body.bob(speed, 0.35F, false, f2, 1F);

            this.chainWave(fishTail, speed * outOfWater, 0.05F * outOfWater, -3, f2, 1);
            this.chainSwing(fishTail, speed * outOfWater, 0.15F * outOfWater, -2.5, f2, 1);
            this.swing(Body, speed * outOfWater, 0.21F * outOfWater, true, 0, 0, f2, 1);

            this.chainWave(finPectoralLeft, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwingExtended(finPectoralLeft, speed * outOfWater, 0.8F * outOfWater, 0.5F, 3, f2, 1);
            this.chainFlap(finPectoralLeft, speed * outOfWater, 0.15F * outOfWater, -0.8, f2, 1);

            this.chainWave(finPectoralRight, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwing(finPectoralRight, speed * outOfWater, -0.8F * outOfWater, 0.5F, f2, 1);
            this.chainFlap(finPectoralRight, speed * outOfWater, -0.15F * outOfWater, 0.8, f2, 1);

            this.chainWave(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwing(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainFlap(finPelvicLeft, speed * outOfWater, 0.10F * outOfWater, -0.5, f2, 1);

            this.chainWave(finPelvicRight, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwingExtended(finPelvicRight, speed * outOfWater, -0.20F * outOfWater, 0.3F, 3, f2, 1);
            this.chainFlap(finPelvicRight, speed * outOfWater, -0.10F * outOfWater, 0.5, f2, 1);

        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCricosaurus ee = (EntityPrehistoricFloraCricosaurus) entitylivingbaseIn;

        if (ee.isReallyInWater()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
        }
        else {
            //Do the LL one defined above
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCricosaurus entity = (EntityPrehistoricFloraCricosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-30 + (((tickAnim - 13) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-30)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 13) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*-10 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10 + (((tickAnim - 13) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2 + (((tickAnim - 13) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 13) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5 + (((tickAnim - 10) / 3) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40 + (((tickAnim - 13) / 7) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCricosaurus entity = (EntityPrehistoricFloraCricosaurus) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*-2), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-20))*5), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-90))*0.5);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-90))*0.5);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-90))*0.5);


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*1), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*5), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*-1));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*-1), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*5), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0), Body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*7), Body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0), Body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-50))*10), Body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(-1.08783), UpperLegL.rotateAngleY + (float) Math.toRadians(11.21357), UpperLegL.rotateAngleZ + (float) Math.toRadians(8.8737+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*-20));


        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(0), LowerLegL.rotateAngleY + (float) Math.toRadians(0), LowerLegL.rotateAngleZ + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*-5));


        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(0), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(25));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-100))*15), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-100))*15), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-100))*25), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.9-250))*25), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*5), UpperArmL.rotateAngleY + (float) Math.toRadians(0), UpperArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8-40))*-10), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*384/0.8))*-1));


        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(0), UpperLegR.rotateAngleY + (float) Math.toRadians(0), UpperLegR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*20));


        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(0), LowerLegR.rotateAngleY + (float) Math.toRadians(0), LowerLegR.rotateAngleZ + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*5));


        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(-25));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*5), UpperArmR.rotateAngleY + (float) Math.toRadians(0), UpperArmR.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCricosaurus entity = (EntityPrehistoricFloraCricosaurus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6))*-0.5), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6))*-4), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-95))*0.5);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-90))*0.3);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-180))*0.5);


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-50))*-3), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6+30))*-2), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-40))*-1), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6+120))*3), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-70))*-1.5), Body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6+90))*5), Body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-100))*-1), Body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6))*11), Body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(21.63016), UpperLegL.rotateAngleY + (float) Math.toRadians(-7.0831+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-0))*3), UpperLegL.rotateAngleZ + (float) Math.toRadians(17.98981));


        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(-23.51003), LowerLegL.rotateAngleY + (float) Math.toRadians(-4.77895), LowerLegL.rotateAngleZ + (float) Math.toRadians(4.421+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2));


        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(0), FootL.rotateAngleY + (float) Math.toRadians(0), FootL.rotateAngleZ + (float) Math.toRadians(-6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-50))*5));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-0))*10), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-50))*15), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-70))*20), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-150))*20), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*2), UpperArmL.rotateAngleY + (float) Math.toRadians(0), UpperArmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6+50))*-1), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6+120))*-3), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(7.72976), UpperLegR.rotateAngleY + (float) Math.toRadians(11.3959+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-0))*10), UpperLegR.rotateAngleZ + (float) Math.toRadians(-16.50786));


        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(0), LowerLegR.rotateAngleY + (float) Math.toRadians(0), LowerLegR.rotateAngleZ + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*5));


        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(0), FootR.rotateAngleY + (float) Math.toRadians(0), FootR.rotateAngleZ + (float) Math.toRadians(13.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*173/0.6-70))*10));


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*2), UpperArmR.rotateAngleY + (float) Math.toRadians(0), UpperArmR.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);

    }
}
