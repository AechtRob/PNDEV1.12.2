package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIllinichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r14;

    public ModelIllinichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.551F, -2.5087F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, -2.0F, -4.301F, -4.4913F, 4, 5, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 2.924F, -0.3163F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, -0.5F, -2.996F, -4.9994F, 3, 3, 5, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.699F, 4.5087F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 25, -0.5F, -1.2F, -5.0F, 3, 3, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.699F, -4.4913F);
        this.root.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 8, 15, -1.0F, -3.9171F, -6.3933F, 2, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 9, -1.5F, -4.9171F, -3.3933F, 3, 3, 4, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 34, -1.5F, -2.6671F, -3.3933F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.7613F, -8.0495F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 0, -0.5F, 0.35F, 1.075F, 2, 1, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -4.325F, -6.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.829F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 17, -0.5F, -0.0022F, -1.9866F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -5.475F, -3.975F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 34, -0.5F, -0.0017F, -2.9905F, 2, 2, 3, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 34, -0.5F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.75F, -3.2921F, -5.6933F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.3927F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 15, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 16, 15, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.75F, -3.2921F, -5.6933F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.3927F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 15, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 16, 15, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -0.9238F, -0.3823F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.7459F, 0.274F, -0.2849F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -0.9238F, -0.3823F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.7459F, -0.274F, 0.2849F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 0, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -1.9238F, -3.3823F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 25, -0.5F, 0.0066F, -3.011F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0066F, -3.011F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 25, -0.5F, -1.0F, 0.025F, 2, 1, 3, -0.001F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 2.699F, -0.3913F);
        this.root.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.5742F, 0.2213F, -0.3271F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 18, 0, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 2.699F, -0.3913F);
        this.root.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.5742F, -0.2213F, 0.3271F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 18, 0, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.8496F, 4.4021F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 15, -1.0F, -1.7014F, -0.8935F, 3, 3, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.716F, 3.4034F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 37, -0.5F, -1.9957F, -1.0079F, 2, 2, 3, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.2486F, 2.1065F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0472F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.5F, 0.0127F, -0.0003F, 0, 4, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.2486F, 2.1065F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 17, -0.5F, -1.9873F, -0.0003F, 2, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.2986F, 0.1065F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 40, -0.5F, -2.95F, 0.0F, 2, 3, 2, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.4514F, 0.1065F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 17, 0.5F, -2.0F, -0.025F, 0, 2, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 25, -0.5F, 0.0F, -0.025F, 2, 2, 6, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.285F, 5.1008F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 39, 6, -0.5F, -0.4914F, 0.0057F, 2, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.4914F, 0.0057F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 29, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2107F, 2.7751F);
        this.tail2.addChild(tail3);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.2021F, 0.2307F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 15, 0.5F, -0.5F, -0.3F, 0, 6, 7, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 0, 0.0F, -0.5F, -0.3F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -1.338F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.63F;
        this.root.setScale(scaler, scaler, scaler);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetY = -0.14F;
        this.root.render(0.01F);
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = -0.1F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
