package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSargodon extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer bottomLeftFin;
    private final AdvancedModelRenderer bottomRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    public ModelSargodon() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -18.0F, -10.0F, 6, 14, 13, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 50, -2.5F, -15.0F, 3.0F, 5, 8, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -15.9053F, 2.1399F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.8334F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 60, 0.475F, -1.45F, 2.05F, 0, 5, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 37, -1.5F, -1.45F, -0.9F, 4, 5, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -18.9097F, -0.5018F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7025F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 52, 0.5F, -3.0F, 1.975F, 0, 6, 4, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 49, -2.0F, -3.025F, -1.925F, 5, 6, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -21.85F, -4.725F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1789F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 49, -1.5F, -0.0272F, 0.0235F, 5, 5, 4, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -18.45F, -9.525F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5716F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 22, -2.5F, -0.29F, -0.1002F, 5, 4, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.1193F, 1.5486F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9512F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 39, 0.5F, 0.1527F, -0.2078F, 0, 4, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.1193F, 1.5486F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.9381F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 0, -1.5F, -2.8473F, -0.2078F, 4, 3, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -1.8193F, -5.4514F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 28, -1.5F, -2.91F, 0.0266F, 5, 3, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -3.5754F, -10.0798F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3752F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 12, -1.5F, -2.9975F, 0.0015F, 5, 3, 5, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 36, 35, -2.5F, -15.0F, -10.0F, 5, 9, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 28, -2.0F, -12.0F, -12.0F, 4, 4, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -15.0648F, -9.9528F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.8029F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 0, -1.5F, -0.0166F, 0.0109F, 4, 3, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -12.7F, -11.8F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.9163F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 9, -1.5F, 0.0093F, 0.0115F, 3, 2, 3, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -9.925F, -12.9F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.1825F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 59, -1.5F, -0.0233F, -0.0036F, 3, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.25F, -9.9413F, -12.9079F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 4, 0.25F, 0.2402F, -2.5157F, 2, 0, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 59, -0.25F, -0.0098F, -2.0157F, 3, 4, 2, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.25F, -7.6733F, -12.2316F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.5708F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, 0.0F, -1.0F, -0.3F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, 2.5F, -1.0F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -6.0F, -10.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6545F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 29, -1.5F, -3.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.65F, -10.05F, -10.85F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.48F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 6, 0, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 28, -0.375F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.65F, -10.05F, -10.85F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.48F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 6, 0, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 28, -0.625F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -7.0713F, -10.0116F);
        this.head.addChild(jaw);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.6021F, -2.22F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.1781F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 0, -1.0F, -1.0F, -0.6F, 2, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.3299F, -2.1963F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.2654F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 60, -0.5F, 0.0277F, -0.0258F, 3, 5, 1, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0299F, -3.6963F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.8727F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 9, -0.5F, 0.0124F, -0.0575F, 3, 2, 1, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -2.8701F, -2.8963F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 46, -0.5F, -0.0098F, -3.0157F, 3, 4, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, -7.5F, -8.55F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1309F, 0.3491F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 0, 0.0684F, -1.984F, -0.0558F, 0, 3, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, -7.5F, -8.55F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1309F, -0.3491F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 0, -0.0684F, -1.984F, -0.0558F, 0, 3, 5, 0.0F, true));

        this.bottomLeftFin = new AdvancedModelRenderer(this);
        this.bottomLeftFin.setRotationPoint(2.5F, -1.9284F, -0.9695F);
        this.main.addChild(bottomLeftFin);
        this.setRotateAngle(bottomLeftFin, 0.4164F, 0.3272F, -0.6284F);
        this.bottomLeftFin.cubeList.add(new ModelBox(bottomLeftFin, 4, 30, -0.0381F, -0.0587F, -0.5F, 0, 2, 1, 0.0F, false));

        this.bottomRightFin = new AdvancedModelRenderer(this);
        this.bottomRightFin.setRotationPoint(-2.5F, -1.9284F, -0.9695F);
        this.main.addChild(bottomRightFin);
        this.setRotateAngle(bottomRightFin, 0.4164F, -0.3272F, 0.6284F);
        this.bottomRightFin.cubeList.add(new ModelBox(bottomRightFin, 4, 30, 0.0381F, -0.0587F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -11.25F, 5.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 57, 18, -1.5F, -2.5F, -0.5F, 4, 5, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -3.0F, 0.5F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7418F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.5F, -1.725F, -0.425F, 0, 1, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 62, -1.0F, -0.725F, -0.425F, 3, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 2.75F, 0.5F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6109F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 9, 0.5F, -1.175F, 0.8F, 0, 2, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 0, -1.0F, -1.175F, -1.2F, 3, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 39, -0.5F, -2.0F, -0.5F, 2, 4, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 28, 0.5F, -7.0F, -0.5F, 0, 14, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.main.offsetZ = -0.33F;
        this.main.offsetY = -0.15F;
        this.main.offsetX = 0.035F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.main.offsetZ = 0.04F;
        this.main.offsetY = -0.05F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.0F;
        this.main.offsetX = 0.15F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.3F, 3.7F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.root.offsetY = 0.2F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(bottomLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(bottomLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(bottomRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(bottomRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.main.offsetY = 1.1F;
                 this.main.offsetZ = 0.3F;
                 this.main.offsetX = 0.5F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
