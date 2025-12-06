package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPhorcynis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPhorcynis extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r20;

    public ModelPhorcynis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-1.0F, 23.0F, 3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, -8.0F, 6, 2, 6, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 7, -1.5F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 18, -1.5F, -0.0469F, -7.5872F, 5, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, 0.2322F, 2.9131F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0567F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 25, -2.5F, -0.625F, -5.85F, 4, 1, 5, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.8529F, -1.3466F, -7.943F);
        this.body.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.4971F, 0.8466F, -3.307F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.685F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 42, -2.1669F, -0.5F, -2.7966F, 2, 1, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.2029F, 0.8466F, -3.307F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.685F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 42, 0.1669F, -0.5F, -2.7966F, 2, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.6471F, 0.8466F, -3.057F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0829F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 36, -2.1309F, -0.5F, -0.0029F, 2, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.3529F, 0.8466F, -3.057F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0829F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 37, 0.1309F, -0.5F, -0.0029F, 2, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1471F, -0.978F, 5.4719F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 31, -2.0F, -0.1532F, -0.373F, 4, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1471F, -1.053F, 1.4469F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 12, -2.5F, -0.1984F, -1.3223F, 5, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1471F, -0.6534F, -0.107F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2051F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 31, -1.5F, 0.475F, -2.5F, 3, 1, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 0, -1.5F, -0.525F, -5.5F, 3, 1, 6, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 41, 1.45F, 0.0F, -3.65F, 1, 1, 4, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 41, -2.45F, 0.0F, -3.65F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1471F, 1.0966F, -2.407F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1265F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 18, -1.5F, -0.2F, -3.0F, 3, 1, 6, 0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.1471F, 1.3466F, -5.407F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.5379F, 0.0748F, -0.4157F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.55F, 0.125F, -1.15F, 1, 0, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.8529F, 1.3466F, -5.407F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.5379F, -0.0748F, 0.4157F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 2, -0.45F, 0.125F, -1.15F, 1, 0, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.1471F, 1.7966F, -2.532F);
        this.head.addChild(jaw);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.25F, 0.625F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1265F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 13, -1.0F, -0.975F, -2.6F, 2, 1, 2, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(4.0F, -0.475F, -7.0F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.2182F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, -6, 51, 0.0F, -0.025F, 0.0F, 6, 0, 6, 0.0F, true));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 8, 0.0F, 0.025F, 0.0F, 6, 0, 6, 0.0F, true));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, -0.475F, -7.0F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.3054F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, -6, 51, -6.0F, -0.025F, 0.0F, 6, 0, 6, 0.0F, false));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 8, -6.0F, 0.025F, 0.0F, 6, 0, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(1.0F, -0.1973F, 1.3965F);
        this.body.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 31, -2.0F, -0.8027F, 0.1035F, 4, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.8027F, 0.1035F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0567F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 27, 0.0F, -2.9F, 0.075F, 0, 3, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.8027F, 0.1035F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0131F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 18, -2.0F, 0.1F, -0.925F, 4, 1, 5, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0723F, 2.1035F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0567F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 13, -1.5F, -0.425F, -2.0F, 3, 1, 4, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-2.0F, -0.0402F, -0.1465F);
        this.tail2.addChild(backrightfin);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, -5, 58, -4.0F, -0.0125F, 0.5F, 4, 0, 5, 0.0F, false));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 7, 25, -4.0F, 0.0125F, 0.5F, 4, 0, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(2.0F, -0.0402F, -0.1465F);
        this.tail2.addChild(backleftfin);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, -5, 58, 0.0F, -0.0125F, 0.5F, 4, 0, 5, 0.0F, true));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 7, 25, 0.0F, 0.0125F, 0.5F, 4, 0, 5, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.578F, 3.5937F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 0, -1.5F, -0.2248F, 0.0098F, 3, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.7248F, 2.0098F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 36, -1.5F, -0.225F, -2.0F, 3, 1, 4, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.4252F, 2.0098F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1004F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 5, -1.0F, -0.55F, -2.075F, 2, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.4425F, 3.6743F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 38, 26, -1.0F, -0.6673F, -0.0145F, 2, 1, 4, 0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 34, 37, -1.0F, -1.3173F, -0.0145F, 2, 1, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.1673F, 1.9855F);
        this.tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 4, 0.0F, -2.75F, -2.0F, 0, 3, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.168F, 3.5392F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 10, 41, -0.5F, -0.4993F, -0.0287F, 1, 1, 4, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 39, 18, -0.5F, -1.1243F, -0.0287F, 1, 1, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.5007F, 1.9713F);
        this.tail5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, -1.1F, 0.85F, 0, 2, 1, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.6174F, 3.5517F);
        this.tail5.addChild(tail6);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.093F, 0.3946F);
        this.tail6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5672F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 5, 0.0F, -0.675F, -0.275F, 0, 3, 9, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 30, -0.5F, -0.675F, -0.275F, 1, 1, 6, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(0);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.02F;
        this.body.offsetZ = -0.05F;
        this.body.offsetY = -0.245F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.3F, 0.0F);
        this.body.offsetY = -0.14F;
        this.body.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.8F;
        this.body.offsetX = 0.4F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.3F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.Root.offsetY = 1.45F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed*0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed*0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| e.isInWater()) { //if moving, slap fins
                this.flap(frontleftfin, speed * 2.5F, 0.3F, false, 0, 0, f2, 1);
                this.flap(frontrightfin, speed* 2.5F, -0.3F, false, 0, 0, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else{ //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(frontleftfin, (speed), 0.25F, false, -3, 0, f2, 1);
                this.flap(frontrightfin, (speed), -0.25F, false, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed), 0.2F, true, 0, 0, f2, 1);



        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPhorcynis e = (EntityPrehistoricFloraPhorcynis) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
