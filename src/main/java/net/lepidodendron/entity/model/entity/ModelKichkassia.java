package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelKichkassia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r18;

    public ModelKichkassia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.0976F, -0.1568F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, -2.0F, -3.0976F, -3.8432F, 4, 6, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -3.0976F, 1.1568F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2967F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, 0.5F, -1.5588F, -5.3409F, 3, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -3.0976F, 0.1568F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 24, 0.5F, -1.4F, -0.15F, 3, 2, 4, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 3.6024F, -0.7182F);
        this.root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 14, 0.5F, -1.0101F, -3.0071F, 3, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 3.4024F, -0.8432F);
        this.root.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, 0.5F, -0.8F, 0.1F, 3, 1, 5, 0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 8.4024F, 3.1568F);
        this.root.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 23, -1.5F, -9.49F, -10.45F, 3, 3, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -6.7282F, -11.3594F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 39, 0.5F, 0.009F, -0.0045F, 2, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -8.6985F, -11.7017F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.7453F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 15, 0.5F, 0.0039F, -2.0043F, 2, 1, 2, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -10.025F, -10.225F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7418F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 11, 0.5F, -0.0157F, -1.9892F, 2, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -4.95F, -6.875F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 17, 0.5F, -1.9911F, -2.0034F, 2, 2, 2, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -11.0F, -7.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 21, 0.5F, -0.64F, -3.3F, 2, 2, 3, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-1.15F, -7.9907F, -10.1142F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.2182F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 40, 0, -0.45F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 15, -0.55F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(1.15F, -7.9907F, -10.1142F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.2182F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 40, 0, -0.55F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 15, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.2139F, -8.5477F);
        this.head.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.9639F, 0.0727F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2662F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 0, 0.0F, -0.95F, -3.15F, 2, 1, 3, -0.01F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(-1.375F, 2.6024F, 1.2568F);
        this.root.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.4363F, 0.0F, 0.6545F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 0, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(1.375F, 2.6024F, 1.2568F);
        this.root.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.4363F, 0.0F, -0.6545F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 0, 0.0F, 0.0F, -0.5F, 0, 3, 3, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(-2.0F, 2.8524F, -3.4682F);
        this.root.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, -0.5236F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 33, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(2.0F, 2.8524F, -3.4682F);
        this.root.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.5236F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightFin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 33, 0.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 8.4024F, 3.1568F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 38, 0.0F, -13.3583F, 1.0797F, 0, 3, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 17, 15, -1.5F, -10.5F, 0.0F, 3, 4, 4, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -6.25F, 0.0F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 31, 0.5F, -0.775F, 0.7F, 2, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -11.8517F, 1.0712F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 33, 0.5F, -0.0066F, 0.0085F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 7, -1.0F, -9.5F, 0.0F, 2, 2, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 36, 0.0F, -13.35F, 0.575F, 0, 3, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -6.2617F, 0.6563F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6981F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 37, 0.5F, -0.2267F, 0.081F, 0, 3, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -7.3679F, 0.6499F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4276F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 5, 0.5F, -1.0424F, -0.7238F, 1, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -10.5F, 0.0F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 31, 0.5F, -0.25F, 0.225F, 1, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.375F, 3.5F);
        this.tail2.addChild(tail3);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -8.0F, 0.5F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3927F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 26, 0.5F, -0.5F, -0.5F, 0, 4, 5, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 27, 0.0F, -0.5F, -0.5F, 1, 1, 3, -0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetZ = -0.76F;
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.03F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.3F, 0.0F, 0.1F);
        this.setRotateAngle(head, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetZ = -0.0F;
        this.root.offsetY = -0.05F;
        this.root.offsetX = 0.005F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.4F;
        this.root.offsetX = 0.4F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.2F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(root, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0f, 0.3f, f2, 1);

            this.flap(backRightFin, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(backLeftFin, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(frontRightFin, speed * 0.8F, -0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(frontLeftFin, speed * 0.8F, 0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(frontRightFin, speed * 0.8F, -0.3F, false, 0F, -0.2F, f2, 1F);
            this.swing(frontLeftFin, speed * 0.8F, 0.3F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.20F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
