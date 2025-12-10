package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEochondrosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r17;

    public ModelEochondrosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.7543F, 2.8509F);
        this.main.cubeList.add(new ModelBox(main, 13, 20, -1.5F, -2.0043F, -0.8509F, 3, 4, 4, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 12, 9, -2.0F, -2.5043F, -5.8509F, 4, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.5043F, -0.8509F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 16, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 2.4957F, -0.8509F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 25, -2.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 7.2457F, -2.8509F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 31, -2.0F, -9.25F, -5.0F, 3, 4, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 0, -0.45F, -8.0255F, -7.5384F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 0, -1.55F, -8.0255F, -7.5384F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -9.35F, -5.9F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 22, -0.5F, 0.025F, -3.0F, 2, 2, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -6.225F, -8.85F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4399F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 0, -0.5F, 0.0017F, -0.0134F, 2, 4, 2, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -8.2F, -8.675F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.4835F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 0, -0.5F, -0.0005F, -2.0211F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -10.25F, -3.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 35, -0.5F, 0.525F, -3.0F, 2, 2, 3, 0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -4.75F, -3.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 31, -0.5F, -2.0F, -3.0F, 2, 2, 3, 0.001F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.75F, -5.625F, -4.475F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.4579F, 0.5998F, -0.1482F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 9, 0, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.75F, -5.625F, -4.475F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.4579F, -0.5998F, 0.1482F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 9, 0, 0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -5.8373F, -5.9309F);
        this.head.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.3877F, -2.9191F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.4399F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -0.5F, 0.0267F, -0.8884F, 2, 3, 1, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1928F, 2.4162F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 17, 0, -1.0F, -1.3115F, -0.2671F, 2, 3, 5, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.5416F, 3.2071F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 31, 0.0F, -1.9F, -2.5F, 0, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.8115F, 1.7329F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 29, -1.0F, 0.05F, -1.175F, 2, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.2134F, 4.2823F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4058F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -1.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.1885F, 1.7329F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1876F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 5, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.8115F, 4.7329F);
        this.tail.addChild(tail2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.175F, 5.85F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.5F, -0.9842F, -5.0125F, 0, 5, 8, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 14, 0.0F, -0.9842F, -7.0125F, 1, 1, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, 0.8F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 11, -0.5F, -0.6F, -0.9F, 1, 1, 2, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 23, -0.5F, -0.3F, -0.2F, 1, 1, 6, 0.001F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 2.2981F, 1.6807F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, -0.5236F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.1977F, -2.5315F);
        this.backLeftFin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0785F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 33, 0.4F, -0.1F, 0.0F, 0, 2, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 2.2981F, 1.6807F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, 0.5236F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.1977F, -2.5315F);
        this.backRightFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0785F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 33, -0.4F, -0.1F, 0.0F, 0, 2, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = -1.295F;
        this.main.offsetY = -0.24F;
        this.main.offsetX = -0.03F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = -0.03F;
        this.main.offsetY = -0.05F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.4F;
        this.main.offsetX = -0.4F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 6.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.7F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(main, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0, f2, 1);

            this.flap(backRightFin, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(backLeftFin, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
           // this.flap(frontRightFin, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
           // this.flap(frontLeftFin, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(frontRightFin, speed * 0.8F, -0.45F, false, 0F, -0.2F, f2, 1F);
            this.swing(frontLeftFin, speed * 0.8F, 0.45F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.head.offsetY = 1.20F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
