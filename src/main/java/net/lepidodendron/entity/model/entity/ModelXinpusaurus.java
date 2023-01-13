package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraXinpusaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelXinpusaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Xinpusaurus;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer LArm;
    private final AdvancedModelRenderer LArm2;
    private final AdvancedModelRenderer LHand;
    private final AdvancedModelRenderer RArm;
    private final AdvancedModelRenderer RArm2;
    private final AdvancedModelRenderer RHand;
    private final AdvancedModelRenderer Hip;
    private final AdvancedModelRenderer RLeg;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer RFoot;
    private final AdvancedModelRenderer LLeg;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer LFoot;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;

    private ModelAnimator animator;

    public ModelXinpusaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Xinpusaurus = new AdvancedModelRenderer(this);
        this.Xinpusaurus.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Xinpusaurus.cubeList.add(new ModelBox(Xinpusaurus, 0, 0, -3.0F, -4.0F, -7.0F, 6, 8, 14, 0.01F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.375F, -6.0F);
        this.Xinpusaurus.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 46, 27, -2.5F, -3.375F, -6.0F, 5, 7, 6, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.625F, -5.0F);
        this.Chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 31, 51, -2.0F, -2.25F, -5.0F, 4, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.75F, -5.0F);
        this.Neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2531F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 0, -2.0F, -1.0F, 0.0F, 4, 1, 5, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 50, 51, -1.5F, -2.0F, -6.0F, 3, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 7, -1.0F, 0.0F, -3.99F, 2, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1833F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -0.5F, 0.0F, -11.95F, 1, 1, 4, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 27, -0.5F, 0.0F, -7.97F, 1, 1, 4, -0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.Head.addChild(bone);
        this.setRotateAngle(bone, -0.0698F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.384F, 0.0F, -0.1658F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 7, 0.3F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.384F, 0.0F, 0.1658F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 7, -0.3F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.25F, -0.5F, -2.5F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 0, -0.25F, -0.5F, -2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 33, -0.5F, -1.0F, -2.93F, 1, 1, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 44, 61, -1.5F, -0.01F, -5.0F, 3, 1, 6, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1134F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 17, -1.5F, -1.0F, 0.0F, 3, 1, 6, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 0, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Jaw.addChild(bone4);
        this.setRotateAngle(bone4, -0.0698F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 7, -1.0F, -1.0F, -3.99F, 2, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.7F, -4.0F);
        this.bone4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 32, -0.3F, -0.8F, 0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.7F, -4.0F);
        this.bone4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 44, 0.3F, -0.8F, 0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.bone4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 32, 0.25F, -0.5F, -2.7F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.bone4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, -0.1745F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 27, -0.25F, -0.5F, -2.7F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.bone4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 27, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.LArm = new AdvancedModelRenderer(this);
        this.LArm.setRotationPoint(-1.5F, 1.875F, -5.0F);
        this.Chest.addChild(LArm);
        this.setRotateAngle(LArm, 2.1673F, 1.2659F, 0.6564F);
        this.LArm.cubeList.add(new ModelBox(LArm, 0, 23, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.LArm2 = new AdvancedModelRenderer(this);
        this.LArm2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0F, -0.3054F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 57, 61, -5.0F, -1.0F, -1.5F, 5, 2, 3, -0.01F, true));

        this.LHand = new AdvancedModelRenderer(this);
        this.LHand.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, 0.0F, -0.3491F);
        this.LHand.cubeList.add(new ModelBox(LHand, 44, 17, -3.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, true));

        this.RArm = new AdvancedModelRenderer(this);
        this.RArm.setRotationPoint(1.5F, 1.875F, -5.0F);
        this.Chest.addChild(RArm);
        this.setRotateAngle(RArm, 2.098F, -1.2289F, -0.5832F);
        this.RArm.cubeList.add(new ModelBox(RArm, 0, 23, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.RArm2 = new AdvancedModelRenderer(this);
        this.RArm2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.0F, 0.3054F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 57, 61, 0.0F, -1.0F, -1.5F, 5, 2, 3, -0.01F, false));

        this.RHand = new AdvancedModelRenderer(this);
        this.RHand.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, 0.0F, 0.3491F);
        this.RHand.cubeList.add(new ModelBox(RHand, 44, 17, -1.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, false));

        this.Hip = new AdvancedModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Xinpusaurus.addChild(Hip);
        this.setRotateAngle(Hip, 0.0F, 0.0F, 0.0F);
        this.Hip.cubeList.add(new ModelBox(Hip, 0, 44, -2.5F, -3.75F, 0.0F, 5, 7, 10, 0.0F, false));

        this.RLeg = new AdvancedModelRenderer(this);
        this.RLeg.setRotationPoint(1.5F, 1.0F, 6.0F);
        this.Hip.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.0375F, -0.8183F, 1.009F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 58, 41, -1.0F, -1.5F, -2.0F, 5, 3, 4, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, -0.6109F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 62, 0, 0.0F, -1.0F, -1.5F, 5, 2, 3, 0.0F, false));

        this.RFoot = new AdvancedModelRenderer(this);
        this.RFoot.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.RLeg2.addChild(RFoot);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 0, 62, -1.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, false));

        this.LLeg = new AdvancedModelRenderer(this);
        this.LLeg.setRotationPoint(-1.5F, 1.0F, 6.0F);
        this.Hip.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0375F, 0.8183F, -1.009F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 58, 41, -4.0F, -1.5F, -2.0F, 5, 3, 4, 0.0F, true));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, 0.6109F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 62, 0, -5.0F, -1.0F, -1.5F, 5, 2, 3, 0.0F, true));

        this.LFoot = new AdvancedModelRenderer(this);
        this.LFoot.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.LLeg2.addChild(LFoot);
        this.LFoot.cubeList.add(new ModelBox(LFoot, 0, 62, -3.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.Hip.addChild(Tail);
        this.setRotateAngle(Tail, 0.0F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 25, 32, -2.0F, -3.0F, -1.0F, 4, 6, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 44, 0, -1.5F, -2.75F, 0.0F, 3, 5, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 23, -1.0F, -2.25F, 0.0F, 2, 4, 16, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 15.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 25, 7, -0.5F, -1.75F, 0.0F, 1, 3, 16, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Xinpusaurus.render(f5);
    }

    public void renderStatic(float f) {
        this.Xinpusaurus.rotateAngleY = (float) Math.toRadians(90);
        this.Xinpusaurus.rotateAngleX = (float) Math.toRadians(-15);
        this.Chest.rotateAngleX = (float) Math.toRadians(5);
        this.Hip.rotateAngleX = (float) Math.toRadians(7.5);
        this.Tail.rotateAngleX = (float) Math.toRadians(7.5);
        this.Tail2.rotateAngleX = (float) Math.toRadians(10);
        this.Jaw.rotateAngleX = (float) Math.toRadians(25);
        this.Xinpusaurus.offsetY = -0.2F;
        this.Xinpusaurus.offsetX = 0.0F;
        this.Xinpusaurus.render(0.01F);
    }

    public void renderStaticSuspended(float f) {
        this.Xinpusaurus.rotateAngleY = (float) Math.toRadians(90);
        this.Xinpusaurus.rotateAngleX = (float) Math.toRadians(-15);
        this.Chest.rotateAngleX = (float) Math.toRadians(5);
        this.Hip.rotateAngleX = (float) Math.toRadians(7.5);
        this.Tail.rotateAngleX = (float) Math.toRadians(7.5);
        this.Tail2.rotateAngleX = (float) Math.toRadians(10);
        this.Jaw.rotateAngleX = (float) Math.toRadians(25);
        this.Xinpusaurus.offsetY = 0F;
        this.Xinpusaurus.offsetX = 0F;
        this.Xinpusaurus.render(0.01F);
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
        //this.Xinpusaurus.offsetY = 0.85F; //72

        EntityPrehistoricFloraXinpusaurus Xin = (EntityPrehistoricFloraXinpusaurus) e;

        this.faceTarget(f3, f4, 4, Neck);
        this.faceTarget(f3, f4, 4, Head);

        float speed = 0.225F / 2F;
        if (Xin.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.Hip, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Upperbody = {this.Chest, this.Neck, this.Head};

        if (!Xin.isReallyInWater()) {
            this.setRotateAngle(Tail3, (float) Math.toRadians(5), -(float) Math.toRadians(0), (float) Math.toRadians(0));
            this.setRotateAngle(this.Tail, -(float) Math.toRadians(5), -(float) Math.toRadians(0), (float) Math.toRadians(0));
            this.setRotateAngle(Neck, -(float) Math.toRadians(10.5), -(float) Math.toRadians(0), (float) Math.toRadians(0));
            this.setRotateAngle(LArm, (float) Math.toRadians(0), (float) Math.toRadians(0), -(float) Math.toRadians(10));
            this.setRotateAngle(RArm, -(float) Math.toRadians(0), -(float) Math.toRadians(0), (float) Math.toRadians(10));


        }
        else {
            speed = speed * 1.5F;

            //Feet:
            AdvancedModelRenderer[] FrontR = {this.RArm, this.RArm2};
            AdvancedModelRenderer[] FrontL = {this.LArm, this.LArm2};
            AdvancedModelRenderer[] BackR = {this.RLeg, this.RLeg2};
            AdvancedModelRenderer[] BackL = {this.LLeg, this.LLeg2};



            if (f3 == 0 ) { //Not moving
                this.chainSwingExtended(FrontL, speed * 0.2F, -0.1F, -1, 0F, f2, 1);
                this.chainSwingExtended(FrontR, speed *0.2F, -0.1F, -1, 3F, f2, 1);
                this.chainSwingExtended(BackL, speed * 0.2F, -0.1F, -1, 0F, f2, 1);
                this.chainSwingExtended(BackR, speed *0.2F, -0.1F, -1, 3F, f2, 1);
                this.swing(Xinpusaurus, speed*0.6F, 0.2F, true, 0, 0, f2, 1);
                return;
            }

            this.chainWave(Tail, speed*2, 0.012F, -0.2, f2, 0.5F);
            this.chainSwing(Tail, speed*2, 0.35F, -2.8, f2, 0.5F);
            this.chainSwing(Upperbody, speed*2 , 0.15F, 0, f2, 0.5F);
            this.swing(Xinpusaurus, speed, 0.2F, true, 0, 0, f2, 1);


        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
