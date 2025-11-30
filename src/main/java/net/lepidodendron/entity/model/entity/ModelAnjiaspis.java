package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAnjiaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r16;

    public ModelAnjiaspis() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -0.95F, -2.0F, 6, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 23, -1.0F, -1.8F, -2.0F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 13, -3.5F, -0.25F, -2.0F, 1, 0, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 19, -2.0F, -0.95F, -4.0F, 4, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 17, -1.0F, -0.95F, -5.0F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 27, -0.5F, -0.25F, -5.5F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -0.95F, -2.0F, 6, 1, 3, 0.001F, true));
        this.head.cubeList.add(new ModelBox(head, 20, 13, 2.5F, -0.25F, -2.0F, 1, 0, 3, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.1391F, -0.6993F, 0.5F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.105F, 0.3416F, -0.0954F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 6, -0.35F, 0.55F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -0.5F, -5.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7592F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 28, 0.5F, 0.25F, -0.4F, 1, 0, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 27, 0.0F, -0.45F, 0.0F, 2, 1, 1, -0.002F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.4507F, -0.5F, -3.6233F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.2348F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 28, 0.05F, 0.275F, -0.4F, 1, 0, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 12, 0.0F, -0.45F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.4507F, -0.5F, -3.6233F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.2348F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 28, -1.05F, 0.275F, -0.4F, 1, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 12, -2.0F, -0.45F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.5F, -5.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7592F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -1.5F, 0.25F, -0.4F, 1, 0, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 27, -2.0F, -0.45F, 0.0F, 2, 1, 1, -0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.8678F, -3.5554F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2662F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 23, -0.5F, -0.475F, -1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.8F, -2.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.288F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 23, -1.0F, 0.0F, -3.0F, 2, 1, 3, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.991F, -1.7864F, -2.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2904F, -0.0468F, 0.419F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 7, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, -1.0F, -0.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 0, -1.7F, -0.075F, -1.5F, 2, 1, 3, -0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.991F, -1.7864F, -2.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2904F, 0.0468F, -0.419F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 7, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.1391F, -0.6993F, 0.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.105F, -0.3416F, 0.0954F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 6, -0.65F, 0.55F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.5F, -1.0F, -0.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.4363F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 0, -0.3F, -0.075F, -1.5F, 2, 1, 3, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0431F, 0.7386F);
        this.head.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 12, 8, -2.0F, 0.0431F, -0.4886F, 4, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.8973F, 2.0341F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.275F, -1.25F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.4319F, -0.4886F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 17, -1.5F, -0.075F, 0.0F, 3, 1, 3, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0719F, 2.0132F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 11, -1.5F, -0.0538F, 0.0983F, 3, 1, 4, -0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 5, -1.5F, -0.4288F, 0.0983F, 3, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.9692F, 0.621F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 5, 0.0F, -0.7F, 0.75F, 0, 1, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2712F, 3.5983F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 2, -1.0F, -0.35F, 0.0F, 2, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 14, -1.0F, -0.65F, 0.0F, 2, 1, 3, 0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3812F, 2.7741F);
        this.tail3.addChild(tail4);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.0188F, -0.2241F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 19, -0.5F, 0.0F, 0.0F, 1, 2, 4, 0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -1.2F;
        this.head.offsetX = 0.238F;
        this.head.rotateAngleY = (float)Math.toRadians(220);
        this.head.rotateAngleX = (float)Math.toRadians(20);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 3.63F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);


            this.swing(head, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                //this.head.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = -0.1F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
