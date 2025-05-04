package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStahleckeria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStahleckeria extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legR3;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended armR;
    private final AdvancedModelRendererExtended armR2;
    private final AdvancedModelRendererExtended armR3;
    private final AdvancedModelRendererExtended armL;
    private final AdvancedModelRendererExtended armL2;
    private final AdvancedModelRendererExtended armL3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;

    private ModelAnimator animator;

    public ModelStahleckeria() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -5.0F, -8.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -9.0F, -0.25F, -1.5F, 18, 17, 16, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 5.0F, 31.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.5672F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 24, 95, -3.0F, 0.0F, -4.0F, 6, 9, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 38, -2.0F, 0.0F, -3.0F, 4, 7, 3, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-9.0F, 9.75F, 23.5F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.2182F, 0.0F, 0.5236F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 71, 0.0F, 0.0F, -4.5F, 8, 10, 9, 0.0F, false));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(2.75F, 8.5F, -4.0F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.3491F, 0.1309F, -0.5236F);
        this.legR2.cubeList.add(new ModelBox(legR2, 79, 88, -2.5F, 0.0F, 0.0F, 7, 9, 7, 0.0F, false));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(0.0F, 7.0F, 3.0F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, -0.1745F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 82, 16, -3.0F, 0.0F, -4.5F, 8, 5, 8, 0.0F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(9.0F, 9.75F, 23.5F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.2182F, 0.0F, -0.5236F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 71, -8.0F, 0.0F, -4.5F, 8, 10, 9, 0.0F, true));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(-2.75F, 8.5F, -4.0F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.3491F, -0.1309F, 0.5236F);
        this.legL2.cubeList.add(new ModelBox(legL2, 79, 88, -4.5F, 0.0F, 0.0F, 7, 9, 7, 0.0F, true));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(0.0F, 7.0F, 3.0F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.1745F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 82, 16, -5.0F, 0.0F, -4.5F, 8, 5, 8, 0.0F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -11.5F, -1.0F, 0.0F, 23, 20, 18, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 58, -9.5F, -0.5F, -11.5F, 19, 17, 13, 0.0F, false));

        this.armR = new AdvancedModelRendererExtended(this);
        this.armR.setRotationPoint(-8.75F, 11.5F, -8.5F);
        this.body2.addChild(armR);
        this.setRotateAngle(armR, 0.829F, -0.5236F, 0.2618F);
        this.armR.cubeList.add(new ModelBox(armR, 51, 88, -1.5F, 0.0F, -3.75F, 7, 10, 7, 0.0F, false));

        this.armR2 = new AdvancedModelRendererExtended(this);
        this.armR2.setRotationPoint(3.2F, 10.0F, 3.0F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, -0.9163F, 0.0F, -0.3927F);
        this.armR2.cubeList.add(new ModelBox(armR2, 0, 90, -3.0F, -0.15F, -5.85F, 6, 10, 6, 0.0F, false));

        this.armR3 = new AdvancedModelRendererExtended(this);
        this.armR3.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.armR2.addChild(armR3);
        this.armR3.cubeList.add(new ModelBox(armR3, 26, 82, -4.0F, -0.3F, -5.35F, 8, 5, 8, 0.0F, false));

        this.armL = new AdvancedModelRendererExtended(this);
        this.armL.setRotationPoint(8.75F, 11.5F, -8.5F);
        this.body2.addChild(armL);
        this.setRotateAngle(armL, 0.829F, 0.5236F, -0.2618F);
        this.armL.cubeList.add(new ModelBox(armL, 51, 88, -5.5F, 0.0F, -3.75F, 7, 10, 7, 0.0F, true));

        this.armL2 = new AdvancedModelRendererExtended(this);
        this.armL2.setRotationPoint(-3.2F, 10.0F, 3.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -0.9163F, 0.0F, 0.3927F);
        this.armL2.cubeList.add(new ModelBox(armL2, 0, 90, -3.0F, -0.15F, -5.85F, 6, 10, 6, 0.0F, true));

        this.armL3 = new AdvancedModelRendererExtended(this);
        this.armL3.setRotationPoint(0.0F, 9.0F, -2.0F);
        this.armL2.addChild(armL3);
        this.armL3.cubeList.add(new ModelBox(armL3, 26, 82, -4.0F, -0.3F, -5.35F, 8, 5, 8, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 5.5F, -10.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 68, 38, -6.5F, -5.0F, -6.0F, 13, 13, 7, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 64, 0, -7.0F, -5.5F, -5.0F, 14, 9, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(2.5F, 2.5F, -8.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6981F, 0.1745F, -0.48F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 99, 0, -1.0F, -0.75F, -2.25F, 1, 3, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(4.0F, -0.5F, -7.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.48F, 0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 43, -1.8F, -2.75F, -0.55F, 2, 7, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-2.5F, 2.5F, -8.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6981F, -0.1745F, 0.48F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 99, 0, 0.0F, -0.75F, -2.25F, 1, 3, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-3.0F, -0.5F, -5.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.3526F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 74, 104, 1.0F, -6.6F, -6.975F, 4, 3, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-3.0F, -0.5F, -5.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7418F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.5F, -4.275F, -5.4F, 5, 5, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-4.0F, -0.5F, -7.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, -0.48F, -0.0436F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 43, -0.2F, -2.75F, -0.55F, 2, 7, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-3.0F, -0.5F, -5.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 103, 100, -1.0F, -2.6F, -3.7F, 8, 7, 4, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 82, 29, -5.0F, -3.0F, -3.0F, 10, 3, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 9, -3.0F, -3.75F, -5.0F, 6, 5, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 71, -5.0F, 0.0F, -4.0F, 10, 3, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 49, 106, -5.0F, 0.0F, 1.0F, 10, 3, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 72, 88, -1.5F, 1.85F, -9.25F, 3, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 48, -3.0F, 1.0F, -3.35F, 6, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 101, 37, -3.0F, -2.0F, -7.35F, 6, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 38, -3.0F, -3.85F, -6.6F, 6, 1, 4, -0.02F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.neck.offsetY = -0.07F;
        this.neck.offsetX = -0.0F;
        this.neck.offsetZ = -0.25F;
        this.neck.rotateAngleY = (float) Math.toRadians(0);
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armL, -0.3F, 0.2F, -0.5F);
        this.setRotateAngle(armL2, -1.3F, 0.0F, 0.5F);
        this.setRotateAngle(armL3, 1.3F, -0.05F, 0.0F);
        this.setRotateAngle(armR, -0.3F, -0.2F, 0.5F);
        this.setRotateAngle(armR2, -1.3F, 0.05F, -0.5F);
        this.setRotateAngle(armR3, 1.3F, 0.05F, 0.0F);
        this.setRotateAngle(legR, 0.6F, -0.0F, 0.7F);
        this.setRotateAngle(legR2, 1.0F, 0.1F, -0.7F);
        this.setRotateAngle(legR3, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(legL, 0.6F, -0.0F, -0.7F);
        this.setRotateAngle(legL2, 1.0F, 0.1F, 0.7F);
        this.setRotateAngle(legL3, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.05F;
        this.body.offsetZ = 0.1F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.6F;
        this.body.offsetX = 0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.5F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.4F, 3.8F, -0.2F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armL, -0.3F, 0.2F, -0.5F);
        this.setRotateAngle(armL2, -1.3F, 0.0F, 0.5F);
        this.setRotateAngle(armL3, 1.3F, -0.05F, 0.0F);
        this.setRotateAngle(armR, -0.3F, -0.2F, 0.5F);
        this.setRotateAngle(armR2, -1.3F, 0.05F, -0.5F);
        this.setRotateAngle(armR3, 1.3F, 0.05F, 0.0F);
        this.setRotateAngle(legR, 0.6F, -0.0F, 0.7F);
        this.setRotateAngle(legR2, 1.0F, 0.1F, -0.7F);
        this.setRotateAngle(legR3, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(legL, 0.6F, -0.0F, -0.7F);
        this.setRotateAngle(legL2, 1.0F, 0.1F, 0.7F);
        this.setRotateAngle(legL3, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
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
        this.body.offsetY = 0F;

        EntityPrehistoricFloraStahleckeria stah = (EntityPrehistoricFloraStahleckeria) e;
        float masterSpeed = stah.getTravelSpeed();

        //float masterSpeed = 0;

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2};

        if (stah.getAnimation() == stah.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            return;
         }

        if (f3 == 0.0F || !stah.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
         }

        float speed = masterSpeed / 2.225F;
        if (stah.getIsFast()) {
            speed = speed * 2;
        }

        this.armL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.armR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(armL, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(armR, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(legL, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(legR, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(armL, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(armR, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(legL, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(legR, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(armL2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(armR2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(legL2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(legR2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(armL2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(armR2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(legL2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(legR2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(armL3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(armR3, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(legL3, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(legR3, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(body, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);


        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStahleckeria e = (EntityPrehistoricFloraStahleckeria) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.body2, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armL, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armL2, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR2, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.body2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armL, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(7);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks

    }
}
