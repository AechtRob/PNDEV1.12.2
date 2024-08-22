package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGregorius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r21;

    public ModelGregorius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, -3.0F, -8.75F, -5.0F, 6, 8, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -9.4843F, -2.6603F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2313F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 50, 0.5F, -3.1896F, 1.2263F, 0, 3, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 27, 0.0F, -1.4396F, 0.2263F, 1, 2, 1, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -9.4843F, -2.6603F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5803F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, -0.5F, -3.0896F, -0.3237F, 1, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -9.675F, -1.0F);
        this.root.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1178F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 9, -0.5F, 0.0046F, -3.9949F, 5, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -9.5F, 2.0F);
        this.root.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0567F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 25, -0.5F, 0.0F, -3.0F, 5, 1, 3, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 19, 23, -2.5F, -8.0F, -8.5F, 5, 7, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -9.25F, -4.75F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3142F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 18, -0.5F, 0.0F, -4.2F, 4, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.8F, -5.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0654F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 6, -2.5F, -1.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5F, -3.0F, -6.5F);
        this.body.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1349F, 0.1937F, -0.2942F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 17, 16, -7.75F, 1.0F, -0.5F, 7, 0, 5, 0.0F, false));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 45, 30, -4.0F, 0.5F, 0.0F, 5, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5F, -3.0F, -6.5F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1432F, -0.1876F, 0.3382F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 17, 16, 0.75F, 1.0F, -0.5F, 7, 0, 5, 0.0F, true));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 45, 30, -1.0F, 0.5F, 0.0F, 5, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -1.5F, -9.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 43, -1.5F, -4.5F, -2.25F, 4, 3, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 0, -1.0F, -4.35F, -4.6F, 3, 2, 3, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -5.1082F, -3.2961F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4887F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 50, -0.5F, -0.0095F, -2.9568F, 2, 1, 3, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -6.5F, 0.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 11, -0.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 40, -0.5F, -1.1F, -3.925F, 2, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 47, -0.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -1.5086F, -2.2994F);
        this.head.addChild(jaw);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.6015F, -0.1708F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4669F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 45, 38, -0.5F, -0.9844F, -3.9954F, 2, 1, 4, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0415F, -3.1986F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6981F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 59, 0.0F, -0.125F, -0.4F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0086F, -0.2006F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 38, -0.5F, -0.1F, -3.925F, 2, 1, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -5.75F, 1.75F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -2.0F, -0.75F, 0.0F, 5, 4, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.85F, 3.9F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 43, 0.5F, -2.0346F, -1.0024F, 0, 3, 5, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 44, -1.0F, -0.0346F, -0.0024F, 3, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -2.797F, 2.349F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6981F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 16, -0.5F, -2.222F, -0.7495F, 1, 3, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -3.75F, 0.0F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 35, -0.5F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3011F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 0, -1.5F, -2.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.172F, 3.4077F, 1.5869F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.5286F, -0.3263F, 0.8108F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 0, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.172F, 3.4077F, 1.5869F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.5286F, 0.3263F, -0.8108F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 0, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 1.1883F, 5.5375F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 30, -1.5F, -1.5883F, -0.8875F, 3, 2, 5, 0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.9117F, 0.4125F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 50, 0.5F, -0.7748F, -0.0926F, 0, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 2.4117F, -0.8875F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 45, -0.5F, -2.0F, 1.4F, 2, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -2.1383F, -0.0625F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 0, -0.5F, -0.075F, 0.2F, 3, 1, 4, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5883F, 3.6125F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 52, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.25F, -0.25F, 2.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 27, 0.25F, -5.0F, 0.0F, 0, 9, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.25F, -0.25F, 0.0F);
        this.tail4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 7, 27, -0.5F, -0.25F, -0.5F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(root, 0.0F, 1.6F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetZ = -0.45F;
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.03F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
        this.root.offsetZ = -0.0F;
        this.root.offsetY = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = 1.05F;
        this.root.rotateAngleY = (float)Math.toRadians(245);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(root, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0, f2, 1);

            this.flap(backRightFin, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(backLeftFin, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(dorsalfinR, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(dorsalfinL, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(frontRightFin, speed * 0.8F, -0.5F, false, 0F, -0.2F, f2, 1F);
            this.swing(frontLeftFin, speed * 0.8F, 0.5F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                this.root.offsetY = -.30F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
