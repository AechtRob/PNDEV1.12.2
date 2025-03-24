package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCamuropiscis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelCamuropiscis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 26.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 13, 13, -2.0F, -10.0F, -7.0F, 4, 5, 7, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, -5.5F, -5.25F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.6545F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 9, 0, -6.0F, 0.0F, -0.75F, 6, 0, 4, 0.0F, true));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, -5.5F, -5.25F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.6545F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 9, 0, 0.0F, 0.0F, -0.75F, 6, 0, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 26, 25, -1.5F, -10.0F, -11.0F, 3, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 25, -1.5F, -9.0F, -11.0F, 3, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.0F, -11.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 36, -0.5F, 0.0F, -5.0F, 1, 1, 2, 0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 27, -1.0F, 1.0F, -1.0F, 2, 1, 1, 0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 5, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.6088F, -13.622F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.685F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 33, -1.0F, -2.0139F, -1.0169F, 2, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, -0.5F, -1.0139F, -2.0169F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.6F, -8.5309F, -12.2206F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.7F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.55F, -8.5309F, -12.2206F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 20, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.001F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 20, 0.6F, -1.0F, -1.0F, 1, 2, 2, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.4559F, -10.8706F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4014F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 33, -1.0F, -2.0F, -3.0F, 2, 2, 3, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.75F, -7.3637F, -13.2012F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, -0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 3, 0.0F, -0.825F, 0.525F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.75F, -7.3637F, -13.2012F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0873F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, 0.0F, -0.825F, 0.525F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.75F, -7.3637F, -13.2012F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2225F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 1, 0.25F, -0.875F, -0.45F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 1, 1.25F, -0.875F, -0.45F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0916F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 30, -1.0F, -2.125F, -4.0F, 2, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.4559F, -10.8706F);
        this.head.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.8F, -0.6209F, -0.914F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6632F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, 0.0F, -0.275F, -1.375F, 0, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, 1.6F, -0.275F, -1.375F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4451F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 16, -1.0F, -0.125F, -2.575F, 2, 1, 3, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -8.4566F, -0.7625F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -2.0F, -1.0434F, -0.2375F, 4, 4, 5, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.5325F, 0.5835F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0567F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 0, 0.0F, -3.9596F, 0.1488F, 0, 4, 6, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 28, -1.5F, 0.0404F, 0.1488F, 3, 1, 4, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.4566F, 0.7625F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 0, -1.5F, -1.1F, -0.975F, 3, 1, 5, -0.01F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.9F, 2.4566F, 3.3875F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.6981F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 25, 13, -5.0F, 0.0F, -0.75F, 5, 0, 3, 0.0F, true));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.9F, 2.4566F, 3.3875F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.6981F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 25, 13, 0.0F, 0.0F, -0.75F, 5, 0, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9615F, 4.5116F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 20, -1.5F, -1.505F, -0.7491F, 3, 3, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.995F, 1.7509F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1484F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 32, -1.0F, -1.15F, -1.5F, 2, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.305F, 0.1509F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1353F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 0, -1.0F, 0.2594F, 0.0701F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6276F, 3.5768F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 6, -1.0F, -0.8773F, -0.3258F, 2, 2, 5, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.1227F, 0.6742F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2662F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 32, -0.5F, -1.025F, 0.0F, 1, 1, 4, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 21, 0.0F, -0.025F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1227F, 4.6742F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 35, 13, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, 0.0F, -6.0F, 0.0F, 0, 10, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = -0.6F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(cube_r1, 0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.685F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.3927F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r8, 0.2225F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.4451F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.0873F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r12, -0.0567F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.6981F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.6981F);
        this.setRotateAngle(tail2, -0.1309F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1353F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r16, 0.2662F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.1074F, -0.2865F, -0.3646F);
        this.setRotateAngle(tail5, -0.2618F, -0.4363F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.04F;
        this.main.offsetY = -0.22F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.5236F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(cube_r1, 0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.685F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.3927F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r8, 0.2225F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0916F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.4451F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.0873F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r12, -0.0567F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, -0.6981F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, 0.6981F);
        this.setRotateAngle(tail2, -0.1309F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1353F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r16, 0.2662F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.1074F, -0.2865F, -0.3646F);
        this.setRotateAngle(tail5, -0.2618F, -0.4363F, 0.0F);
        this.main.offsetX = -0.01F;
        this.main.offsetY = -0.3F;
        this.main.offsetZ = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.25F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontleftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backleftfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backleftfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backrightfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backrightfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = -0.3F;
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

