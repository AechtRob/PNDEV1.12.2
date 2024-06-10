package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiictodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDiictodon extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended rightleg1;
    private final AdvancedModelRendererExtended rightleg2;
    private final AdvancedModelRendererExtended rightleg3;
    private final AdvancedModelRendererExtended leftleg1;
    private final AdvancedModelRendererExtended leftleg2;
    private final AdvancedModelRendererExtended leftleg3;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended rightarm1;
    private final AdvancedModelRendererExtended rightarm2;
    private final AdvancedModelRendererExtended rightarm3;
    private final AdvancedModelRendererExtended leftarm1;
    private final AdvancedModelRendererExtended leftarm2;
    private final AdvancedModelRendererExtended leftarm3;
    private final AdvancedModelRendererExtended tail;

    private ModelAnimator animator;

    public ModelDiictodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, 18.0F, 7.5F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 12, -2.0F, -0.85F, 0.2F, 4, 4, 3, 0.0F, false));

        this.rightleg1 = new AdvancedModelRendererExtended(this);
        this.rightleg1.setRotationPoint(-1.75F, 0.5F, 1.25F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.6545F, 0.7854F, 0.0F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 24, 26, -0.9F, 0.0F, -1.0F, 2, 3, 2, 0.01F, false));

        this.rightleg2 = new AdvancedModelRendererExtended(this);
        this.rightleg2.setRotationPoint(0.0F, 2.75F, -1.0F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6545F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 16, 24, -0.9F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.rightleg3 = new AdvancedModelRendererExtended(this);
        this.rightleg3.setRotationPoint(0.0F, 3.0F, 0.75F);
        this.rightleg2.addChild(rightleg3);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 20, -1.4F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.leftleg1 = new AdvancedModelRendererExtended(this);
        this.leftleg1.setRotationPoint(1.75F, 0.5F, 1.25F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.6545F, -0.7854F, 0.0F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 24, 26, -1.1F, 0.0F, -1.0F, 2, 3, 2, 0.01F, true));

        this.leftleg2 = new AdvancedModelRendererExtended(this);
        this.leftleg2.setRotationPoint(0.0F, 2.75F, -1.0F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6545F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 16, 24, -1.1F, 0.0F, 0.0F, 2, 3, 2, 0.0F, true));

        this.leftleg3 = new AdvancedModelRendererExtended(this);
        this.leftleg3.setRotationPoint(0.0F, 3.0F, 0.75F);
        this.leftleg2.addChild(leftleg3);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 20, -1.6F, 0.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -2.0F, -6.5F, 5, 5, 7, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -6.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 12, -2.0F, -1.5F, -3.5F, 4, 4, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 2.5F, -3.5F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 19, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.15F, -3.25F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.2618F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 17, 0, -1.5F, -1.5F, -3.25F, 3, 3, 4, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 6, 24, -1.5F, -0.9718F, -1.9274F, 3, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 0, -1.0F, -0.9718F, -3.9274F, 2, 2, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -0.9718F, -3.9274F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.015F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.0F, -0.4718F, -3.9274F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 0.75F, 0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.0F, 1.75F, 0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -0.925F, -0.35F, 0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.95F, -0.5F, 0.1F, 1, 2, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.4718F, -3.9274F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.75F, 0.1F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 1.75F, 0.1F, 0, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, -0.075F, -0.35F, 0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.05F, -0.5F, 0.1F, 1, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.0282F, -0.9274F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 28, -1.0F, 0.0F, -3.0F, 2, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 7, -1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.rightarm1 = new AdvancedModelRendererExtended(this);
        this.rightarm1.setRotationPoint(-1.25F, 2.0F, -2.5F);
        this.chest.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 0.0F, -1.2654F, -0.1309F);
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 23, 21, -0.9F, -1.0F, -0.5F, 2, 2, 3, 0.0F, false));

        this.rightarm2 = new AdvancedModelRendererExtended(this);
        this.rightarm2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.0F, 1.309F, 0.3927F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 12, 12, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 12, -0.5F, 0.0F, 0.0F, 1, 2, 1, -0.01F, false));

        this.rightarm3 = new AdvancedModelRendererExtended(this);
        this.rightarm3.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.1745F, 0.0F, 0.0F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 27, 11, -1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F, false));

        this.leftarm1 = new AdvancedModelRendererExtended(this);
        this.leftarm1.setRotationPoint(1.25F, 2.0F, -2.5F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.0F, 1.2654F, 0.1309F);
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 23, 21, -1.1F, -1.0F, -0.5F, 2, 2, 3, 0.0F, true));

        this.leftarm2 = new AdvancedModelRendererExtended(this);
        this.leftarm2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.0F, -1.309F, -0.3927F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 12, 12, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 12, -0.5F, 0.0F, 0.0F, 1, 2, 1, -0.01F, true));

        this.leftarm3 = new AdvancedModelRendererExtended(this);
        this.leftarm3.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.1745F, 0.0F, 0.0F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 27, 11, -1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.5672F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 24, -0.5F, -0.25F, -0.5F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.05F);
        this.setRotateAngle(neck, -0.15F, 0.2F, 0.1F);
        this.setRotateAngle(head, -0.1F, 0.05F, 0.05F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.2F);
        this.setRotateAngle(rightleg1, 0.0F, 0.1F, 0.3F);
        this.setRotateAngle(rightleg2, 1.0F, 0.1F, 0.0F);
        this.setRotateAngle(rightleg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm1, 0.0F, 1.2F, 0.0F);
        this.setRotateAngle(leftarm2, 0.5F, -0.9F, 0.0F);
        this.setRotateAngle(leftarm3, 0.4F, 0.0F, 0.0F);
        this.hips.offsetY = 0.037F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.5F;
        this.hips.offsetX = 0.2F;
        this.hips.rotateAngleY = (float)Math.toRadians(150);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 4.0F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.0F, 0.0F, -0.05F);
        this.setRotateAngle(neck, -0.15F, 0.4F, 0.1F);
        this.setRotateAngle(head, -0.1F, 0.3F, 0.05F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.2F);
        this.setRotateAngle(rightleg1, 0.0F, 0.1F, 0.3F);
        this.setRotateAngle(rightleg2, 1.0F, 0.1F, 0.0F);
        this.setRotateAngle(rightleg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm1, 0.0F, 1.2F, 0.0F);
        this.setRotateAngle(leftarm2, 0.5F, -0.9F, 0.0F);
        this.setRotateAngle(leftarm3, 0.4F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.hips.offsetY = 1.02F;

        EntityPrehistoricFloraDiictodon Diictodon = (EntityPrehistoricFloraDiictodon) e;
        float masterSpeed = Diictodon.getTravelSpeed();

        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail};

        if (Diictodon.getAnimation() == Diictodon.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (Diictodon.getScreaming()) {
            this.neck.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(jaw, 1.5F, 0.15F, false, 0, 1.5F, f2, 1F);
        }

        if (f3 == 0.0F || !Diictodon.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

//        float speed = masterSpeed / 0.965F;
//        if (Diictodon.getIsFast()) {
//            speed = speed * 1.5F;
//        }
//
//        this.frontleftleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 1, f2, 1.5F);;
//        this.frontrightleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 4, f2, 1.5F);;
//        this.rearleftleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
//        this.rearrightleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;
//
//        this.flap(frontleftleg1, speed, -0.1F, true, 4, 0.05F, f2, 1F);
//        this.flap(frontrightleg1, speed, 0.1F, true, 7, -0.05F, f2, 1F);
//        this.flap(rearleftleg1, speed, 0.1F, false, 7, -0.05F, f2, 1F);
//        this.flap(rearrightleg1, speed, -0.1F, false, 4, 0.05F, f2, 1F);
//
//        this.swing(frontleftleg1, speed, -0.40F, true, 5, 0.18F, f2, 1F);
//        this.swing(frontrightleg1, speed, 0.40F, true, 8, -0.18F, f2, 1F);
//        this.swing(rearleftleg1, speed, -0.30F, true, 8, 0F, f2, 1F);
//        this.swing(rearrightleg1, speed, 0.30F, true, 5, 0F, f2, 1F);
//
//        this.swing(frontleftleg2, speed, -0.25F, true, 6, 0F, f2, 1F);
//        this.swing(frontrightleg2, speed, 0.25F, true, 9, 0F, f2, 1F);
//        this.swing(rearleftleg2, speed, -0.20F, true, 9, 0F, f2, 1F);
//        this.swing(rearrightleg2, speed, 0.20F, true, 6, 0F, f2, 1F);
//
//        this.flap(frontleftleg2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
//        this.flap(frontrightleg2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
//        this.flap(rearleftleg2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
//        this.flap(rearrightleg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);
//
//        this.swing(frontleftfoot, speed, -0.30F, true, 2, 0.10F, f2, 1F);
//        this.swing(frontrightfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
//        this.swing(rearleftfoot, speed, -0.25F, true, 5, 0.08F, f2, 1F);
//        this.swing(rearrightfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);
//
//        this.bobExtended(body, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);
//
//        this.flap(pelvis, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
//        this.flap(body, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
//        this.flap(bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
//
//        this.walk(bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);
//
//        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
//        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
//        this.chainWave(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
//        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
//
//        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDiictodon ee = (EntityPrehistoricFloraDiictodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiictodon entity = (EntityPrehistoricFloraDiictodon) entitylivingbaseIn;


        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (18.76662-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.85266-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.06097-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 23) {
            xx = 18.76662 + (((tickAnim - 4) / 19) * (20.05319-(18.76662)));
            yy = 1.85266 + (((tickAnim - 4) / 19) * (5.92852-(1.85266)));
            zz = 1.06097 + (((tickAnim - 4) / 19) * (3.39511-(1.06097)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20.05319 + (((tickAnim - 23) / 5) * (13.7766-(20.05319)));
            yy = 5.92852 + (((tickAnim - 23) / 5) * (2.96426-(5.92852)));
            zz = 3.39511 + (((tickAnim - 23) / 5) * (1.69756-(3.39511)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 13.7766 + (((tickAnim - 28) / 4) * (17.5-(13.7766)));
            yy = 2.96426 + (((tickAnim - 28) / 4) * (0-(2.96426)));
            zz = 1.69756 + (((tickAnim - 28) / 4) * (0-(1.69756)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 32) / 4) * (22.78-(17.5)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 22.78 + (((tickAnim - 36) / 4) * (0-(22.78)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 10) / 7) * (12.2512-(10)));
            yy = 0 + (((tickAnim - 10) / 7) * (12.69876-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-14.24166-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 12.2512 + (((tickAnim - 17) / 5) * (12.2512-(12.2512)));
            yy = 12.69876 + (((tickAnim - 17) / 5) * (12.69876-(12.69876)));
            zz = -14.24166 + (((tickAnim - 17) / 5) * (-14.24166-(-14.24166)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 12.2512 + (((tickAnim - 22) / 3) * (7.40051-(12.2512)));
            yy = 12.69876 + (((tickAnim - 22) / 3) * (-24.93239-(12.69876)));
            zz = -14.24166 + (((tickAnim - 22) / 3) * (0.80374-(-14.24166)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 7.40051 + (((tickAnim - 25) / 6) * (7.40051-(7.40051)));
            yy = -24.93239 + (((tickAnim - 25) / 6) * (-24.93239-(-24.93239)));
            zz = 0.80374 + (((tickAnim - 25) / 6) * (0.80374-(0.80374)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 7.40051 + (((tickAnim - 31) / 3) * (10-(7.40051)));
            yy = -24.93239 + (((tickAnim - 31) / 3) * (0-(-24.93239)));
            zz = 0.80374 + (((tickAnim - 31) / 3) * (0-(0.80374)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 34) / 6) * (0-(10)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (12.5-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 13) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (12.5-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 28) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiictodon entity = (EntityPrehistoricFloraDiictodon) entitylivingbaseIn;

        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.38-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 19.38 + (((tickAnim - 15) / 8) * (37.5-(19.38)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 37.5 + (((tickAnim - 23) / 12) * (35-(37.5)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 35 + (((tickAnim - 35) / 2) * (37.5-(35)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 37.5 + (((tickAnim - 37) / 8) * (0-(37.5)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (10.78-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 10.78 + (((tickAnim - 6) / 3) * (4.48-(10.78)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 4.48 + (((tickAnim - 9) / 4) * (30.36-(4.48)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30.36 + (((tickAnim - 13) / 7) * (0.27-(30.36)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.27 + (((tickAnim - 20) / 5) * (-7.62103-(0.27)));
            yy = 0 + (((tickAnim - 20) / 5) * (-17.9227-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (25.77812-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -7.62103 + (((tickAnim - 25) / 3) * (-23.85086-(-7.62103)));
            yy = -17.9227 + (((tickAnim - 25) / 3) * (-14.93559-(-17.9227)));
            zz = 25.77812 + (((tickAnim - 25) / 3) * (21.48177-(25.77812)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -23.85086 + (((tickAnim - 28) / 2) * (-10.67125-(-23.85086)));
            yy = -14.93559 + (((tickAnim - 28) / 2) * (-11.96473-(-14.93559)));
            zz = 21.48177 + (((tickAnim - 28) / 2) * (24.85196-(21.48177)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -10.67125 + (((tickAnim - 30) / 4) * (-23.72489-(-10.67125)));
            yy = -11.96473 + (((tickAnim - 30) / 4) * (-6.97943-(-11.96473)));
            zz = 24.85196 + (((tickAnim - 30) / 4) * (14.49698-(24.85196)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -23.72489 + (((tickAnim - 34) / 3) * (-3.55708-(-23.72489)));
            yy = -6.97943 + (((tickAnim - 34) / 3) * (-3.98824-(-6.97943)));
            zz = 14.49698 + (((tickAnim - 34) / 3) * (8.28399-(14.49698)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -3.55708 + (((tickAnim - 37) / 3) * (-14.63425-(-3.55708)));
            yy = -3.98824 + (((tickAnim - 37) / 3) * (-2.39295-(-3.98824)));
            zz = 8.28399 + (((tickAnim - 37) / 3) * (4.97039-(8.28399)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -14.63425 + (((tickAnim - 40) / 3) * (0.24758-(-14.63425)));
            yy = -2.39295 + (((tickAnim - 40) / 3) * (-0.3092-(-2.39295)));
            zz = 4.97039 + (((tickAnim - 40) / 3) * (-2.43592-(4.97039)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0.24758 + (((tickAnim - 43) / 2) * (0-(0.24758)));
            yy = -0.3092 + (((tickAnim - 43) / 2) * (0-(-0.3092)));
            zz = -2.43592 + (((tickAnim - 43) / 2) * (0-(-2.43592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (22.5-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 22.5 + (((tickAnim - 28) / 3) * (0-(22.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiictodon entity = (EntityPrehistoricFloraDiictodon) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-5))*1), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-5))*-6));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-5))*2), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-5))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-5))*-5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-5))*6));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*1)), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-400))*-1)));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4.07984 + (((tickAnim - 0) / 5) * (54.93487-(4.07984)));
            yy = -33.74367 + (((tickAnim - 0) / 5) * (-24.21792-(-33.74367)));
            zz = 6.49012 + (((tickAnim - 0) / 5) * (18.5644-(6.49012)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 54.93487 + (((tickAnim - 5) / 3) * (32.47479-(54.93487)));
            yy = -24.21792 + (((tickAnim - 5) / 3) * (-27.84399-(-24.21792)));
            zz = 18.5644 + (((tickAnim - 5) / 3) * (22.89522-(18.5644)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 32.47479 + (((tickAnim - 8) / 0) * (-1.72268-(32.47479)));
            yy = -27.84399 + (((tickAnim - 8) / 0) * (-30.79383-(-27.84399)));
            zz = 22.89522 + (((tickAnim - 8) / 0) * (14.69267-(22.89522)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.72268 + (((tickAnim - 8) / 2) * (4.07984-(-1.72268)));
            yy = -30.79383 + (((tickAnim - 8) / 2) * (-33.74367-(-30.79383)));
            zz = 14.69267 + (((tickAnim - 8) / 2) * (6.49012-(14.69267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 11.25 + (((tickAnim - 1) / 2) * (5.63-(11.25)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.63 + (((tickAnim - 3) / 2) * (-15-(5.63)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -15 + (((tickAnim - 5) / 1) * (-1.25-(-15)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -1.25 + (((tickAnim - 6) / 2) * (-5.42-(-1.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.42 + (((tickAnim - 8) / 2) * (0-(-5.42)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.59313 + (((tickAnim - 0) / 1) * (-24.15625-(-2.59313)));
            yy = -10.66304 + (((tickAnim - 0) / 1) * (-10.08014-(-10.66304)));
            zz = -6.89503 + (((tickAnim - 0) / 1) * (-0.98276-(-6.89503)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -24.15625 + (((tickAnim - 1) / 2) * (-39.2605-(-24.15625)));
            yy = -10.08014 + (((tickAnim - 1) / 2) * (-8.42908-(-10.08014)));
            zz = -0.98276 + (((tickAnim - 1) / 2) * (-5.7669-(-0.98276)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -39.2605 + (((tickAnim - 3) / 2) * (-33.73499-(-39.2605)));
            yy = -8.42908 + (((tickAnim - 3) / 2) * (-9.93191-(-8.42908)));
            zz = -5.7669 + (((tickAnim - 3) / 2) * (-14.48174-(-5.7669)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -33.73499 + (((tickAnim - 5) / 1) * (-38.44953-(-33.73499)));
            yy = -9.93191 + (((tickAnim - 5) / 1) * (-10.11469-(-9.93191)));
            zz = -14.48174 + (((tickAnim - 5) / 1) * (-12.58507-(-14.48174)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -38.44953 + (((tickAnim - 6) / 2) * (5.45474-(-38.44953)));
            yy = -10.11469 + (((tickAnim - 6) / 2) * (-10.48026-(-10.11469)));
            zz = -12.58507 + (((tickAnim - 6) / 2) * (-8.79171-(-12.58507)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.45474 + (((tickAnim - 8) / 2) * (-2.59313-(5.45474)));
            yy = -10.48026 + (((tickAnim - 8) / 2) * (-10.66304-(-10.48026)));
            zz = -8.79171 + (((tickAnim - 8) / 2) * (-6.89503-(-8.79171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 54.93487 + (((tickAnim - 0) / 3) * (32.47479-(54.93487)));
            yy = 24.21792 + (((tickAnim - 0) / 3) * (27.84399-(24.21792)));
            zz = -18.5644 + (((tickAnim - 0) / 3) * (-22.89522-(-18.5644)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 32.47479 + (((tickAnim - 3) / 1) * (-1.72268-(32.47479)));
            yy = 27.84399 + (((tickAnim - 3) / 1) * (30.79383-(27.84399)));
            zz = -22.89522 + (((tickAnim - 3) / 1) * (-14.69267-(-22.89522)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -1.72268 + (((tickAnim - 4) / 1) * (4.07984-(-1.72268)));
            yy = 30.79383 + (((tickAnim - 4) / 1) * (33.74367-(30.79383)));
            zz = -14.69267 + (((tickAnim - 4) / 1) * (-6.49012-(-14.69267)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.07984 + (((tickAnim - 5) / 5) * (54.93487-(4.07984)));
            yy = 33.74367 + (((tickAnim - 5) / 5) * (24.21792-(33.74367)));
            zz = -6.49012 + (((tickAnim - 5) / 5) * (-18.5644-(-6.49012)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -15 + (((tickAnim - 0) / 1) * (-1.25-(-15)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -1.25 + (((tickAnim - 1) / 3) * (-5.42-(-1.25)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.42 + (((tickAnim - 4) / 1) * (0-(-5.42)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (11.25-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 6) / 2) * (5.63-(11.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.63 + (((tickAnim - 8) / 2) * (-15-(5.63)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -33.73499 + (((tickAnim - 0) / 1) * (-38.44953-(-33.73499)));
            yy = 9.93191 + (((tickAnim - 0) / 1) * (10.11469-(9.93191)));
            zz = 14.48174 + (((tickAnim - 0) / 1) * (12.58507-(14.48174)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -38.44953 + (((tickAnim - 1) / 3) * (5.45474-(-38.44953)));
            yy = 10.11469 + (((tickAnim - 1) / 3) * (10.48026-(10.11469)));
            zz = 12.58507 + (((tickAnim - 1) / 3) * (8.79171-(12.58507)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5.45474 + (((tickAnim - 4) / 1) * (-2.59313-(5.45474)));
            yy = 10.48026 + (((tickAnim - 4) / 1) * (10.66304-(10.48026)));
            zz = 8.79171 + (((tickAnim - 4) / 1) * (6.89503-(8.79171)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.59313 + (((tickAnim - 5) / 1) * (-24.15625-(-2.59313)));
            yy = 10.66304 + (((tickAnim - 5) / 1) * (10.08014-(10.66304)));
            zz = 6.89503 + (((tickAnim - 5) / 1) * (0.98276-(6.89503)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -24.15625 + (((tickAnim - 6) / 2) * (-39.2605-(-24.15625)));
            yy = 10.08014 + (((tickAnim - 6) / 2) * (8.42908-(10.08014)));
            zz = 0.98276 + (((tickAnim - 6) / 2) * (5.7669-(0.98276)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -39.2605 + (((tickAnim - 8) / 2) * (-33.73499-(-39.2605)));
            yy = 8.42908 + (((tickAnim - 8) / 2) * (9.93191-(8.42908)));
            zz = 5.7669 + (((tickAnim - 8) / 2) * (14.48174-(5.7669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22.42932 + (((tickAnim - 0) / 4) * (-120.00039-(22.42932)));
            yy = 18.30957 + (((tickAnim - 0) / 4) * (28.81979-(18.30957)));
            zz = -37.83609 + (((tickAnim - 0) / 4) * (114.93899-(-37.83609)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -120.00039 + (((tickAnim - 4) / 1) * (-135.95382-(-120.00039)));
            yy = 28.81979 + (((tickAnim - 4) / 1) * (22.64882-(28.81979)));
            zz = 114.93899 + (((tickAnim - 4) / 1) * (123.55941-(114.93899)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -135.95382 + (((tickAnim - 5) / 3) * (-47.92808-(-135.95382)));
            yy = 22.64882 + (((tickAnim - 5) / 3) * (18.99343-(22.64882)));
            zz = 123.55941 + (((tickAnim - 5) / 3) * (41.28822-(123.55941)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -47.92808 + (((tickAnim - 8) / 2) * (22.42932-(-47.92808)));
            yy = 18.99343 + (((tickAnim - 8) / 2) * (18.30957-(18.99343)));
            zz = 41.28822 + (((tickAnim - 8) / 2) * (-37.83609-(41.28822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 42.71165 + (((tickAnim - 0) / 1) * (19.70434-(42.71165)));
            yy = -38.25181 + (((tickAnim - 0) / 1) * (-24.77672-(-38.25181)));
            zz = 52.43976 + (((tickAnim - 0) / 1) * (58.95955-(52.43976)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 19.70434 + (((tickAnim - 1) / 3) * (104.88171-(19.70434)));
            yy = -24.77672 + (((tickAnim - 1) / 3) * (-24.07246-(-24.77672)));
            zz = 58.95955 + (((tickAnim - 1) / 3) * (103.29914-(58.95955)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 104.88171 + (((tickAnim - 4) / 1) * (111.85416-(104.88171)));
            yy = -24.07246 + (((tickAnim - 4) / 1) * (-17.97895-(-24.07246)));
            zz = 103.29914 + (((tickAnim - 4) / 1) * (109.7785-(103.29914)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 111.85416 + (((tickAnim - 5) / 3) * (48.3817-(111.85416)));
            yy = -17.97895 + (((tickAnim - 5) / 3) * (-44.16779-(-17.97895)));
            zz = 109.7785 + (((tickAnim - 5) / 3) * (42.11436-(109.7785)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 48.3817 + (((tickAnim - 8) / 2) * (42.71165-(48.3817)));
            yy = -44.16779 + (((tickAnim - 8) / 2) * (-38.25181-(-44.16779)));
            zz = 42.11436 + (((tickAnim - 8) / 2) * (52.43976-(42.11436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -18.13888 + (((tickAnim - 0) / 1) * (44.51405-(-18.13888)));
            yy = -6.11369 + (((tickAnim - 0) / 1) * (-5.00744-(-6.11369)));
            zz = -25.36906 + (((tickAnim - 0) / 1) * (-18.56586-(-25.36906)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.51405 + (((tickAnim - 1) / 1) * (61.10219-(44.51405)));
            yy = -5.00744 + (((tickAnim - 1) / 1) * (-4.16844-(-5.00744)));
            zz = -18.56586 + (((tickAnim - 1) / 1) * (-13.40622-(-18.56586)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 61.10219 + (((tickAnim - 2) / 2) * (19.74255-(61.10219)));
            yy = -4.16844 + (((tickAnim - 2) / 2) * (-2.75144-(-4.16844)));
            zz = -13.40622 + (((tickAnim - 2) / 2) * (-4.69196-(-13.40622)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 19.74255 + (((tickAnim - 4) / 1) * (32.47283-(19.74255)));
            yy = -2.75144 + (((tickAnim - 4) / 1) * (-1.68868-(-2.75144)));
            zz = -4.69196 + (((tickAnim - 4) / 1) * (1.84373-(-4.69196)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 32.47283 + (((tickAnim - 5) / 1) * (34.55685-(32.47283)));
            yy = -1.68868 + (((tickAnim - 5) / 1) * (2.04941-(-1.68868)));
            zz = 1.84373 + (((tickAnim - 5) / 1) * (-20.49137-(1.84373)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 34.55685 + (((tickAnim - 6) / 2) * (6.64087-(34.55685)));
            yy = 2.04941 + (((tickAnim - 6) / 2) * (5.78751-(2.04941)));
            zz = -20.49137 + (((tickAnim - 6) / 2) * (-42.82647-(-20.49137)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.64087 + (((tickAnim - 8) / 2) * (-18.13888-(6.64087)));
            yy = 5.78751 + (((tickAnim - 8) / 2) * (-6.11369-(5.78751)));
            zz = -42.82647 + (((tickAnim - 8) / 2) * (-25.36906-(-42.82647)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -135.95382 + (((tickAnim - 0) / 3) * (-47.92808-(-135.95382)));
            yy = -22.64882 + (((tickAnim - 0) / 3) * (-18.99343-(-22.64882)));
            zz = -123.55941 + (((tickAnim - 0) / 3) * (-41.28822-(-123.55941)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -47.92808 + (((tickAnim - 3) / 2) * (22.42932-(-47.92808)));
            yy = -18.99343 + (((tickAnim - 3) / 2) * (-18.30957-(-18.99343)));
            zz = -41.28822 + (((tickAnim - 3) / 2) * (37.83609-(-41.28822)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.42932 + (((tickAnim - 5) / 3) * (-120.00039-(22.42932)));
            yy = -18.30957 + (((tickAnim - 5) / 3) * (-28.81979-(-18.30957)));
            zz = 37.83609 + (((tickAnim - 5) / 3) * (-114.93899-(37.83609)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -120.00039 + (((tickAnim - 8) / 2) * (-135.95382-(-120.00039)));
            yy = -28.81979 + (((tickAnim - 8) / 2) * (-22.64882-(-28.81979)));
            zz = -114.93899 + (((tickAnim - 8) / 2) * (-123.55941-(-114.93899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 111.85416 + (((tickAnim - 0) / 3) * (48.3817-(111.85416)));
            yy = 17.97895 + (((tickAnim - 0) / 3) * (44.16779-(17.97895)));
            zz = -109.7785 + (((tickAnim - 0) / 3) * (-42.11436-(-109.7785)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 48.3817 + (((tickAnim - 3) / 2) * (42.71165-(48.3817)));
            yy = 44.16779 + (((tickAnim - 3) / 2) * (38.25181-(44.16779)));
            zz = -42.11436 + (((tickAnim - 3) / 2) * (-52.43976-(-42.11436)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 42.71165 + (((tickAnim - 5) / 1) * (19.70434-(42.71165)));
            yy = 38.25181 + (((tickAnim - 5) / 1) * (24.77672-(38.25181)));
            zz = -52.43976 + (((tickAnim - 5) / 1) * (-58.95955-(-52.43976)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 19.70434 + (((tickAnim - 6) / 2) * (104.88171-(19.70434)));
            yy = 24.77672 + (((tickAnim - 6) / 2) * (24.07246-(24.77672)));
            zz = -58.95955 + (((tickAnim - 6) / 2) * (-103.29914-(-58.95955)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 104.88171 + (((tickAnim - 8) / 2) * (111.85416-(104.88171)));
            yy = 24.07246 + (((tickAnim - 8) / 2) * (17.97895-(24.07246)));
            zz = -103.29914 + (((tickAnim - 8) / 2) * (-109.7785-(-103.29914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 32.47283 + (((tickAnim - 0) / 1) * (34.55685-(32.47283)));
            yy = 1.68868 + (((tickAnim - 0) / 1) * (-2.04941-(1.68868)));
            zz = -1.84373 + (((tickAnim - 0) / 1) * (20.49137-(-1.84373)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 34.55685 + (((tickAnim - 1) / 2) * (6.64087-(34.55685)));
            yy = -2.04941 + (((tickAnim - 1) / 2) * (-5.78751-(-2.04941)));
            zz = 20.49137 + (((tickAnim - 1) / 2) * (42.82647-(20.49137)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.64087 + (((tickAnim - 3) / 2) * (-18.13888-(6.64087)));
            yy = -5.78751 + (((tickAnim - 3) / 2) * (6.11369-(-5.78751)));
            zz = 42.82647 + (((tickAnim - 3) / 2) * (25.36906-(42.82647)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -18.13888 + (((tickAnim - 5) / 1) * (44.51405-(-18.13888)));
            yy = 6.11369 + (((tickAnim - 5) / 1) * (5.00744-(6.11369)));
            zz = 25.36906 + (((tickAnim - 5) / 1) * (18.56586-(25.36906)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 44.51405 + (((tickAnim - 6) / 1) * (61.10219-(44.51405)));
            yy = 5.00744 + (((tickAnim - 6) / 1) * (4.16844-(5.00744)));
            zz = 18.56586 + (((tickAnim - 6) / 1) * (13.40622-(18.56586)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 61.10219 + (((tickAnim - 7) / 1) * (19.74255-(61.10219)));
            yy = 4.16844 + (((tickAnim - 7) / 1) * (2.75144-(4.16844)));
            zz = 13.40622 + (((tickAnim - 7) / 1) * (4.69196-(13.40622)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.74255 + (((tickAnim - 8) / 2) * (32.47283-(19.74255)));
            yy = 2.75144 + (((tickAnim - 8) / 2) * (1.68868-(2.75144)));
            zz = 4.69196 + (((tickAnim - 8) / 2) * (-1.84373-(4.69196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiictodon entity = (EntityPrehistoricFloraDiictodon) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-5))*1), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-5))*-6));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-5))*2), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-5))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-5))*-5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-5))*6));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*1)), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-400))*-1)));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 4.07984 + (((tickAnim - 0) / 11) * (54.93487-(4.07984)));
            yy = -33.74367 + (((tickAnim - 0) / 11) * (-24.21792-(-33.74367)));
            zz = 6.49012 + (((tickAnim - 0) / 11) * (18.5644-(6.49012)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 54.93487 + (((tickAnim - 11) / 4) * (32.47479-(54.93487)));
            yy = -24.21792 + (((tickAnim - 11) / 4) * (-27.84399-(-24.21792)));
            zz = 18.5644 + (((tickAnim - 11) / 4) * (22.89522-(18.5644)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 32.47479 + (((tickAnim - 15) / 3) * (-1.72268-(32.47479)));
            yy = -27.84399 + (((tickAnim - 15) / 3) * (-30.79383-(-27.84399)));
            zz = 22.89522 + (((tickAnim - 15) / 3) * (14.69267-(22.89522)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.72268 + (((tickAnim - 18) / 2) * (4.07984-(-1.72268)));
            yy = -30.79383 + (((tickAnim - 18) / 2) * (-33.74367-(-30.79383)));
            zz = 14.69267 + (((tickAnim - 18) / 2) * (6.49012-(14.69267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 11.25 + (((tickAnim - 3) / 3) * (5.63-(11.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 5.63 + (((tickAnim - 6) / 5) * (-15-(5.63)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -15 + (((tickAnim - 11) / 1) * (-1.25-(-15)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 12) / 6) * (-5.42-(-1.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.42 + (((tickAnim - 18) / 2) * (0-(-5.42)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.59313 + (((tickAnim - 0) / 3) * (-24.15625-(-2.59313)));
            yy = -10.66304 + (((tickAnim - 0) / 3) * (-10.08014-(-10.66304)));
            zz = -6.89503 + (((tickAnim - 0) / 3) * (-0.98276-(-6.89503)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -24.15625 + (((tickAnim - 3) / 3) * (-39.2605-(-24.15625)));
            yy = -10.08014 + (((tickAnim - 3) / 3) * (-8.42908-(-10.08014)));
            zz = -0.98276 + (((tickAnim - 3) / 3) * (-5.7669-(-0.98276)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -39.2605 + (((tickAnim - 6) / 5) * (-33.73499-(-39.2605)));
            yy = -8.42908 + (((tickAnim - 6) / 5) * (-9.93191-(-8.42908)));
            zz = -5.7669 + (((tickAnim - 6) / 5) * (-14.48174-(-5.7669)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -33.73499 + (((tickAnim - 11) / 1) * (-38.44953-(-33.73499)));
            yy = -9.93191 + (((tickAnim - 11) / 1) * (-10.11469-(-9.93191)));
            zz = -14.48174 + (((tickAnim - 11) / 1) * (-12.58507-(-14.48174)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -38.44953 + (((tickAnim - 12) / 6) * (5.45474-(-38.44953)));
            yy = -10.11469 + (((tickAnim - 12) / 6) * (-10.48026-(-10.11469)));
            zz = -12.58507 + (((tickAnim - 12) / 6) * (-8.79171-(-12.58507)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5.45474 + (((tickAnim - 18) / 2) * (-2.59313-(5.45474)));
            yy = -10.48026 + (((tickAnim - 18) / 2) * (-10.66304-(-10.48026)));
            zz = -8.79171 + (((tickAnim - 18) / 2) * (-6.89503-(-8.79171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 54.93487 + (((tickAnim - 0) / 5) * (32.47479-(54.93487)));
            yy = 24.21792 + (((tickAnim - 0) / 5) * (27.84399-(24.21792)));
            zz = -18.5644 + (((tickAnim - 0) / 5) * (-22.89522-(-18.5644)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.47479 + (((tickAnim - 5) / 3) * (-1.72268-(32.47479)));
            yy = 27.84399 + (((tickAnim - 5) / 3) * (30.79383-(27.84399)));
            zz = -22.89522 + (((tickAnim - 5) / 3) * (-14.69267-(-22.89522)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -1.72268 + (((tickAnim - 8) / 3) * (4.07984-(-1.72268)));
            yy = 30.79383 + (((tickAnim - 8) / 3) * (33.74367-(30.79383)));
            zz = -14.69267 + (((tickAnim - 8) / 3) * (-6.49012-(-14.69267)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 4.07984 + (((tickAnim - 11) / 9) * (54.93487-(4.07984)));
            yy = 33.74367 + (((tickAnim - 11) / 9) * (24.21792-(33.74367)));
            zz = -6.49012 + (((tickAnim - 11) / 9) * (-18.5644-(-6.49012)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -15 + (((tickAnim - 0) / 2) * (-1.25-(-15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -1.25 + (((tickAnim - 2) / 6) * (-5.42-(-1.25)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -5.42 + (((tickAnim - 8) / 3) * (0-(-5.42)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (11.25-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 11.25 + (((tickAnim - 13) / 4) * (5.63-(11.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5.63 + (((tickAnim - 17) / 3) * (-15-(5.63)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -33.73499 + (((tickAnim - 0) / 2) * (-38.44953-(-33.73499)));
            yy = 9.93191 + (((tickAnim - 0) / 2) * (10.11469-(9.93191)));
            zz = 14.48174 + (((tickAnim - 0) / 2) * (12.58507-(14.48174)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -38.44953 + (((tickAnim - 2) / 6) * (5.45474-(-38.44953)));
            yy = 10.11469 + (((tickAnim - 2) / 6) * (10.48026-(10.11469)));
            zz = 12.58507 + (((tickAnim - 2) / 6) * (8.79171-(12.58507)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 5.45474 + (((tickAnim - 8) / 3) * (-2.59313-(5.45474)));
            yy = 10.48026 + (((tickAnim - 8) / 3) * (10.66304-(10.48026)));
            zz = 8.79171 + (((tickAnim - 8) / 3) * (6.89503-(8.79171)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2.59313 + (((tickAnim - 11) / 2) * (-24.15625-(-2.59313)));
            yy = 10.66304 + (((tickAnim - 11) / 2) * (10.08014-(10.66304)));
            zz = 6.89503 + (((tickAnim - 11) / 2) * (0.98276-(6.89503)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -24.15625 + (((tickAnim - 13) / 4) * (-39.2605-(-24.15625)));
            yy = 10.08014 + (((tickAnim - 13) / 4) * (8.42908-(10.08014)));
            zz = 0.98276 + (((tickAnim - 13) / 4) * (5.7669-(0.98276)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -39.2605 + (((tickAnim - 17) / 3) * (-33.73499-(-39.2605)));
            yy = 8.42908 + (((tickAnim - 17) / 3) * (9.93191-(8.42908)));
            zz = 5.7669 + (((tickAnim - 17) / 3) * (14.48174-(5.7669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 22.42932 + (((tickAnim - 0) / 8) * (-120.00039-(22.42932)));
            yy = 18.30957 + (((tickAnim - 0) / 8) * (28.81979-(18.30957)));
            zz = -37.83609 + (((tickAnim - 0) / 8) * (114.93899-(-37.83609)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -120.00039 + (((tickAnim - 8) / 3) * (-135.95382-(-120.00039)));
            yy = 28.81979 + (((tickAnim - 8) / 3) * (22.64882-(28.81979)));
            zz = 114.93899 + (((tickAnim - 8) / 3) * (123.55941-(114.93899)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -135.95382 + (((tickAnim - 11) / 4) * (-47.92808-(-135.95382)));
            yy = 22.64882 + (((tickAnim - 11) / 4) * (18.99343-(22.64882)));
            zz = 123.55941 + (((tickAnim - 11) / 4) * (41.28822-(123.55941)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -47.92808 + (((tickAnim - 15) / 5) * (22.42932-(-47.92808)));
            yy = 18.99343 + (((tickAnim - 15) / 5) * (18.30957-(18.99343)));
            zz = 41.28822 + (((tickAnim - 15) / 5) * (-37.83609-(41.28822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 42.71165 + (((tickAnim - 0) / 3) * (19.70434-(42.71165)));
            yy = -38.25181 + (((tickAnim - 0) / 3) * (-24.77672-(-38.25181)));
            zz = 52.43976 + (((tickAnim - 0) / 3) * (58.95955-(52.43976)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 19.70434 + (((tickAnim - 3) / 5) * (104.88171-(19.70434)));
            yy = -24.77672 + (((tickAnim - 3) / 5) * (-24.07246-(-24.77672)));
            zz = 58.95955 + (((tickAnim - 3) / 5) * (103.29914-(58.95955)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 104.88171 + (((tickAnim - 8) / 3) * (111.85416-(104.88171)));
            yy = -24.07246 + (((tickAnim - 8) / 3) * (-17.97895-(-24.07246)));
            zz = 103.29914 + (((tickAnim - 8) / 3) * (109.7785-(103.29914)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 111.85416 + (((tickAnim - 11) / 4) * (48.3817-(111.85416)));
            yy = -17.97895 + (((tickAnim - 11) / 4) * (-44.16779-(-17.97895)));
            zz = 109.7785 + (((tickAnim - 11) / 4) * (42.11436-(109.7785)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 48.3817 + (((tickAnim - 15) / 5) * (42.71165-(48.3817)));
            yy = -44.16779 + (((tickAnim - 15) / 5) * (-38.25181-(-44.16779)));
            zz = 42.11436 + (((tickAnim - 15) / 5) * (52.43976-(42.11436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.13888 + (((tickAnim - 0) / 3) * (44.51405-(-18.13888)));
            yy = -6.11369 + (((tickAnim - 0) / 3) * (-5.00744-(-6.11369)));
            zz = -25.36906 + (((tickAnim - 0) / 3) * (-18.56586-(-25.36906)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 44.51405 + (((tickAnim - 3) / 1) * (61.10219-(44.51405)));
            yy = -5.00744 + (((tickAnim - 3) / 1) * (-4.16844-(-5.00744)));
            zz = -18.56586 + (((tickAnim - 3) / 1) * (-13.40622-(-18.56586)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 61.10219 + (((tickAnim - 4) / 4) * (19.74255-(61.10219)));
            yy = -4.16844 + (((tickAnim - 4) / 4) * (-2.75144-(-4.16844)));
            zz = -13.40622 + (((tickAnim - 4) / 4) * (-4.69196-(-13.40622)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 19.74255 + (((tickAnim - 8) / 3) * (32.47283-(19.74255)));
            yy = -2.75144 + (((tickAnim - 8) / 3) * (-1.68868-(-2.75144)));
            zz = -4.69196 + (((tickAnim - 8) / 3) * (1.84373-(-4.69196)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 32.47283 + (((tickAnim - 11) / 2) * (34.55685-(32.47283)));
            yy = -1.68868 + (((tickAnim - 11) / 2) * (2.04941-(-1.68868)));
            zz = 1.84373 + (((tickAnim - 11) / 2) * (-20.49137-(1.84373)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 34.55685 + (((tickAnim - 13) / 2) * (6.64087-(34.55685)));
            yy = 2.04941 + (((tickAnim - 13) / 2) * (5.78751-(2.04941)));
            zz = -20.49137 + (((tickAnim - 13) / 2) * (-42.82647-(-20.49137)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.64087 + (((tickAnim - 15) / 5) * (-18.13888-(6.64087)));
            yy = 5.78751 + (((tickAnim - 15) / 5) * (-6.11369-(5.78751)));
            zz = -42.82647 + (((tickAnim - 15) / 5) * (-25.36906-(-42.82647)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -135.95382 + (((tickAnim - 0) / 5) * (-47.92808-(-135.95382)));
            yy = -22.64882 + (((tickAnim - 0) / 5) * (-18.99343-(-22.64882)));
            zz = -123.55941 + (((tickAnim - 0) / 5) * (-41.28822-(-123.55941)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -47.92808 + (((tickAnim - 5) / 6) * (22.42932-(-47.92808)));
            yy = -18.99343 + (((tickAnim - 5) / 6) * (-18.30957-(-18.99343)));
            zz = -41.28822 + (((tickAnim - 5) / 6) * (37.83609-(-41.28822)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 22.42932 + (((tickAnim - 11) / 7) * (-120.00039-(22.42932)));
            yy = -18.30957 + (((tickAnim - 11) / 7) * (-28.81979-(-18.30957)));
            zz = 37.83609 + (((tickAnim - 11) / 7) * (-114.93899-(37.83609)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -120.00039 + (((tickAnim - 18) / 2) * (-135.95382-(-120.00039)));
            yy = -28.81979 + (((tickAnim - 18) / 2) * (-22.64882-(-28.81979)));
            zz = -114.93899 + (((tickAnim - 18) / 2) * (-123.55941-(-114.93899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 111.85416 + (((tickAnim - 0) / 5) * (48.3817-(111.85416)));
            yy = 17.97895 + (((tickAnim - 0) / 5) * (44.16779-(17.97895)));
            zz = -109.7785 + (((tickAnim - 0) / 5) * (-42.11436-(-109.7785)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 48.3817 + (((tickAnim - 5) / 6) * (42.71165-(48.3817)));
            yy = 44.16779 + (((tickAnim - 5) / 6) * (38.25181-(44.16779)));
            zz = -42.11436 + (((tickAnim - 5) / 6) * (-52.43976-(-42.11436)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 42.71165 + (((tickAnim - 11) / 2) * (19.70434-(42.71165)));
            yy = 38.25181 + (((tickAnim - 11) / 2) * (24.77672-(38.25181)));
            zz = -52.43976 + (((tickAnim - 11) / 2) * (-58.95955-(-52.43976)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 19.70434 + (((tickAnim - 13) / 5) * (104.88171-(19.70434)));
            yy = 24.77672 + (((tickAnim - 13) / 5) * (24.07246-(24.77672)));
            zz = -58.95955 + (((tickAnim - 13) / 5) * (-103.29914-(-58.95955)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 104.88171 + (((tickAnim - 18) / 2) * (111.85416-(104.88171)));
            yy = 24.07246 + (((tickAnim - 18) / 2) * (17.97895-(24.07246)));
            zz = -103.29914 + (((tickAnim - 18) / 2) * (-109.7785-(-103.29914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.47283 + (((tickAnim - 0) / 3) * (34.55685-(32.47283)));
            yy = 1.68868 + (((tickAnim - 0) / 3) * (-2.04941-(1.68868)));
            zz = -1.84373 + (((tickAnim - 0) / 3) * (20.49137-(-1.84373)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 34.55685 + (((tickAnim - 3) / 2) * (6.64087-(34.55685)));
            yy = -2.04941 + (((tickAnim - 3) / 2) * (-5.78751-(-2.04941)));
            zz = 20.49137 + (((tickAnim - 3) / 2) * (42.82647-(20.49137)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 6.64087 + (((tickAnim - 5) / 6) * (-18.13888-(6.64087)));
            yy = -5.78751 + (((tickAnim - 5) / 6) * (6.11369-(-5.78751)));
            zz = 42.82647 + (((tickAnim - 5) / 6) * (25.36906-(42.82647)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -18.13888 + (((tickAnim - 11) / 2) * (44.51405-(-18.13888)));
            yy = 6.11369 + (((tickAnim - 11) / 2) * (5.00744-(6.11369)));
            zz = 25.36906 + (((tickAnim - 11) / 2) * (18.56586-(25.36906)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 44.51405 + (((tickAnim - 13) / 1) * (61.10219-(44.51405)));
            yy = 5.00744 + (((tickAnim - 13) / 1) * (4.16844-(5.00744)));
            zz = 18.56586 + (((tickAnim - 13) / 1) * (13.40622-(18.56586)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 61.10219 + (((tickAnim - 14) / 4) * (19.74255-(61.10219)));
            yy = 4.16844 + (((tickAnim - 14) / 4) * (2.75144-(4.16844)));
            zz = 13.40622 + (((tickAnim - 14) / 4) * (4.69196-(13.40622)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 19.74255 + (((tickAnim - 18) / 2) * (32.47283-(19.74255)));
            yy = 2.75144 + (((tickAnim - 18) / 2) * (1.68868-(2.75144)));
            zz = 4.69196 + (((tickAnim - 18) / 2) * (-1.84373-(4.69196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiictodon e = (EntityPrehistoricFloraDiictodon) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
