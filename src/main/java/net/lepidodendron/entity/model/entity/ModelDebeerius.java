package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDebeerius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftPelvic;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightPelvic;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;

    public ModelDebeerius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.5F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -4.1732F, -2.05F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.8268F, -1.95F, 4, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.8768F, -1.95F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 0, -1.5F, 0.0F, 0.075F, 3, 2, 1, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.8768F, -1.95F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2313F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 0, -1.5F, -0.15F, 1.025F, 3, 1, 4, -0.01F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(0.0F, -1.8768F, -1.6F);
        this.body.addChild(spike);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.2F, 0.9F);
        this.spike.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5192F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 35, 0.0F, -2.5241F, -0.3688F, 0, 3, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3011F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 11, -0.5F, -3.375F, -0.025F, 1, 4, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.0125F, 2.8292F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 16, -1.5F, -1.5893F, -0.0292F, 3, 3, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.7893F, -0.5292F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.192F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 39, 0.0F, -1.0066F, 1.876F, 0, 1, 4, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, -1.5F, -0.0066F, -0.124F, 3, 2, 6, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.1607F, -0.0292F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1527F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 20, -1.5F, -1.0F, 0.0F, 3, 1, 5, -0.001F, false));

        this.leftPelvic = new AdvancedModelRenderer(this);
        this.leftPelvic.setRotationPoint(1.75F, 1.4857F, -0.3292F);
        this.body2.addChild(leftPelvic);
        this.setRotateAngle(leftPelvic, 0.0F, 0.1745F, 0.0F);
        this.leftPelvic.cubeList.add(new ModelBox(leftPelvic, 32, 0, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.525F, 0.0F, 2.0F);
        this.leftPelvic.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 18, 0.0F, -0.5F, -0.225F, 0, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.5F, 0.1F);
        this.leftPelvic.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 21, 0.0F, -0.6F, 0.975F, 0, 2, 4, 0.0F, false));

        this.rightPelvic = new AdvancedModelRenderer(this);
        this.rightPelvic.setRotationPoint(-1.75F, 1.4857F, -0.3292F);
        this.body2.addChild(rightPelvic);
        this.setRotateAngle(rightPelvic, 0.0F, -0.1745F, 0.0F);
        this.rightPelvic.cubeList.add(new ModelBox(rightPelvic, 32, 0, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.525F, 0.0F, 2.0F);
        this.rightPelvic.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 18, 0.0F, -0.5F, -0.225F, 0, 1, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.5F, 0.1F);
        this.rightPelvic.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 21, 0.0F, -0.6F, 0.975F, 0, 2, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.0893F, 4.8977F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 25, 25, -1.0F, -1.0F, -0.9269F, 2, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.5F, 0.0731F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 38, -0.5F, 0.0F, 0.0F, 2, 1, 3, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.5F, 0.0731F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1527F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 6, -0.5F, -1.075F, -0.975F, 2, 1, 4, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.7F, -5.4269F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.192F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 43, 0.0F, -1.0066F, 5.876F, 0, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0381F, 2.8585F);
        this.tail.addChild(tail2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -0.4619F, 2.2146F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 32, 0.5F, -0.275F, -2.125F, 1, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 0.0381F, 0.4646F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 38, 1.025F, -1.075F, 0.35F, 0, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.0381F, 0.4646F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 32, 0.5F, -0.1F, -0.575F, 1, 1, 4, -0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.7839F, 0.5103F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.192F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -1.1717F, -0.1165F, 0, 2, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1295F, 3.7907F);
        this.tail2.addChild(tail3);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 0.1676F, 0.9239F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.432F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 4, 1.5F, -0.8F, -0.575F, 0, 4, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 0.1676F, 0.9239F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 25, 1.0F, -0.85F, -0.825F, 1, 1, 5, -0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, 0.1732F, -2.95F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 11, 32, -2.5F, -1.0F, -1.0F, 3, 5, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 27, -2.0F, -0.25F, -3.5F, 2, 4, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 12, -2.0F, 1.75F, -7.0F, 2, 1, 4, 0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -1.694F, -0.8937F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1789F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 28, -1.0F, -0.007F, 0.0115F, 2, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -0.3F, -3.55F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4843F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 37, 15, -1.5F, -0.0039F, 0.0113F, 2, 2, 3, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.875F, -5.225F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6152F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 6, -1.5F, 1.0033F, -0.1926F, 2, 1, 2, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 42, -1.0F, 0.0033F, -0.9426F, 1, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 1.8072F, -5.833F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4363F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 29, 32, -0.5F, -0.55F, -1.05F, 1, 1, 2, -0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 3.5F, -2.0F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 25, -1.0F, -0.65F, -0.875F, 2, 1, 2, 0.0F, false));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(0.475F, 3.275F, -0.2F);
        this.head.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, -0.5307F, 0.9346F, -0.441F);
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 37, 8, -0.8961F, -0.6579F, -0.1847F, 1, 1, 4, 0.0F, false));
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 37, 0, -0.3961F, -2.2329F, 1.1153F, 0, 3, 4, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-2.475F, 3.275F, -0.2F);
        this.head.addChild(rightPectoral);
        this.setRotateAngle(rightPectoral, -0.5307F, -0.9346F, 0.441F);
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 37, 8, -0.1039F, -0.6579F, -0.1847F, 1, 1, 4, 0.0F, true));
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 37, 0, 0.3961F, -2.2329F, 1.1153F, 0, 3, 4, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.275F, 0.15F, -1.95F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.48F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 25, 43, -0.525F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 20, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.725F, 0.15F, -1.95F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.48F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 25, 43, -0.475F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 20, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.0F, 2.725F, -3.6F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 38, -1.0F, 0.0F, -2.75F, 2, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetX = -0.035F;
        this.root.offsetY = -0.23F;
        this.root.offsetZ = -0.77F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
        this.root.offsetZ = -0.0F;
        this.root.offsetY = -0.05F;
        this.root.offsetX = 0.005F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = 0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
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
        this.resetToDefaultPose();
        //this.root.offsetY = 1.4F;
        //this.root.offsetZ = -0.65F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.tail, this.tail2, this.tail3};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0.2f, f2, 1);

            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(leftPectoral, (float) (speed ), 0.2F, true, 0, 0, f2, 0.5F);
            this.swing(leftPectoral, (float) (speed), 0.5F, true, 0, 0, f2, 0.5F);
            this.flap(rightPectoral, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.swing(rightPectoral, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.flap(leftPelvic, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(rightPelvic, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);

                //this.root.offsetY = 1.25F;
                //this.root.offsetZ = -0.2F;
                this.bob(root, -speed, 2F, false, f2, 1);
            }
        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
       // animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}