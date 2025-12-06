package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTanaocrossus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightpectoral;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftpectoral;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightpelvic;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftpelvic;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;

    public ModelTanaocrossus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -6.5F, -2.0F, 4, 6, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 13, 0.0F, -9.5F, -1.5F, 0, 3, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -6.25F, 1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 8, -1.0F, -0.65F, -2.85F, 3, 2, 6, 0.0F, false));

        this.rightpectoral = new AdvancedModelRenderer(this);
        this.rightpectoral.setRotationPoint(-2.0F, -1.0F, -1.8F);
        this.body.addChild(rightpectoral);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.rightpectoral.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5672F, 0.0F, 0.829F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, 0.0F, -0.2F, -0.325F, 0, 2, 2, 0.0F, false));

        this.leftpectoral = new AdvancedModelRenderer(this);
        this.leftpectoral.setRotationPoint(2.0F, -1.0F, -1.8F);
        this.body.addChild(leftpectoral);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.leftpectoral.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, -0.829F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, 0.0F, -0.2F, -0.325F, 0, 2, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.0184F, 4.5609F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -1.5F, -3.4816F, -0.0609F, 3, 6, 6, -0.001F, false));
        this.body2.cubeList.add(new ModelBox(body2, 37, 3, 0.0F, -6.4816F, -0.0609F, 0, 3, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -3.7316F, 2.9391F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 0, -0.5F, -0.3F, -3.05F, 3, 1, 6, -0.002F, false));

        this.rightpelvic = new AdvancedModelRenderer(this);
        this.rightpelvic.setRotationPoint(-1.5F, 2.0184F, 0.4391F);
        this.body2.addChild(rightpelvic);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.rightpelvic.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.0F, -0.25F, 0, 2, 2, 0.0F, false));

        this.leftpelvic = new AdvancedModelRenderer(this);
        this.leftpelvic.setRotationPoint(1.5F, 2.0184F, 0.4391F);
        this.body2.addChild(leftpelvic);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.leftpelvic.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5236F, 0.0F, -0.5236F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, 0.0F, -0.25F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.3987F, 4.943F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 30, -1.0F, -1.3329F, -0.0039F, 2, 3, 5, 0.001F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 27, 0.0F, -5.3329F, -0.0039F, 0, 4, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 2.7517F, 1.9675F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.1781F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 39, 0.5F, -0.875F, -1.175F, 0, 4, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.6671F, 2.4961F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5236F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, -0.5F, -1.325F, -2.5F, 2, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.3329F, 0.9961F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 0, -0.5F, 0.0F, -0.075F, 2, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3329F, 4.9961F);
        this.tail.addChild(tail2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 17, 0.975F, -2.0F, -0.2F, 0, 5, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 27, 0.5F, -1.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 1.0F, 0.1F);
        this.body.addChild(head);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.5232F, -2.0504F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.1345F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 39, -1.5F, -2.9905F, -0.0262F, 3, 3, 2, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -6.4F, -5.875F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.4835F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 33, -2.0F, -0.7555F, -2.6761F, 4, 5, 2, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -6.5F, -2.5F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 25, -1.5F, -0.7F, -4.175F, 3, 2, 5, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-2.1F, -4.7089F, -5.7775F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.5236F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.7F, -1.6911F, -0.0975F);
        this.eye.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.4835F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 16, 1.0F, -0.3555F, -2.1761F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 16, -2.2F, -0.3555F, -2.1761F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -3.6232F, -3.7754F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 12, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.body.offsetZ = -1.1F;
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.08F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.body.offsetZ = -0.02F;
        this.body.offsetY = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.8F;
        this.body.offsetX = 1.0F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 4.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(body, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0, f2, 1);

            this.flap(rightpelvic, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(leftpelvic, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            this.flap(rightpectoral, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(leftpectoral, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(rightpectoral, speed * 0.8F, 0.65F, false, 0F, -0.2F, f2, 1F);
            this.swing(leftpectoral, speed * 0.8F, -0.65F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.20F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
