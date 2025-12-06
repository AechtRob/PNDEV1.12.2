package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelJoinvillichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer leftCl;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightCl;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail4;

    public ModelJoinvillichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -6.3F, -3.1F, 4, 6, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -2.4355F, -6.6047F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 31, -0.5F, -0.875F, 2.0F, 3, 2, 2, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -4.3924F, -6.3871F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 10, -0.5F, -2.0F, 0.0F, 3, 2, 4, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -2.4605F, -6.9047F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, -0.5F, -2.0F, -0.65F, 3, 2, 5, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.0276F, -8.8573F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 34, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -6.1429F, -5.8465F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 6, -0.5F, 0.0F, -5.0F, 2, 1, 3, 0.003F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 11, -1.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -7.5281F, -3.1855F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 36, -0.5F, -0.5F, -2.5F, 1, 1, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 39, -1.6F, 1.0F, -2.3F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 39, 0.6F, 1.0F, -2.3F, 1, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 17, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.006F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -10.698F, 0.7511F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 40, -1.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -8.4861F, 0.4231F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 38, -1.5F, -1.0F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.75F, -1.5F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.8727F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 38, -0.5F, 0.0F, -0.2F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -7.75F, -1.5F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, -0.5F, 0.0F, -1.7F, 3, 2, 3, 0.0F, false));

        this.leftCl = new AdvancedModelRenderer(this);
        this.leftCl.setRotationPoint(1.825F, -0.975F, -1.45F);
        this.main.addChild(leftCl);
        this.setRotateAngle(leftCl, 0.3356F, -0.0038F, -0.6416F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.leftCl.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightCl = new AdvancedModelRenderer(this);
        this.rightCl.setRotationPoint(-1.825F, -0.975F, -1.45F);
        this.main.addChild(rightCl);
        this.setRotateAngle(rightCl, 0.3356F, 0.0038F, 0.6416F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.rightCl.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.7911F, -4.4784F);
        this.main.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.6194F, -2.1763F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 6, 0.0F, -0.25F, -1.45F, 1, 1, 0, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 17, -0.5F, -1.8F, -0.3F, 2, 2, 3, -0.006F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 24, -0.5F, 0.0F, -1.7F, 2, 1, 4, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4804F, -0.517F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 0, -1.5F, -2.9196F, 0.017F, 3, 6, 3, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -3.9953F, 2.0093F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6458F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 36, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -4.1696F, 0.017F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 29, -0.5F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, 2.5804F, 3.267F);
        this.tail.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.49F, 0.1925F, -0.3444F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 13, 18, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, 2.5804F, 3.267F);
        this.tail.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.49F, -0.1925F, 0.3444F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 13, 18, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.045F, 2.8446F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 24, -1.0F, -1.6246F, -0.4777F, 2, 3, 3, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.964F, 1.8005F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.2305F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 21, 1.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 3.1254F, 0.1723F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6196F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 30, -0.5F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -2.9586F, 0.4228F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.8203F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 39, 1.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -2.7466F, 0.762F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5585F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 0, -0.5F, 0.0F, -0.4F, 2, 2, 3, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4996F, 2.1723F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 33, 23, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.875F, 0.5F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 34, -0.5F, -1.05F, -0.6F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.45F, 2.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 24, 0.0F, -3.0F, 0.0F, 0, 5, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.25F;
        this.main.offsetX = -0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
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
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
//            this.walk(pelvicfinleft, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
//            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
//            this.walk(pelvicfinright, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
//            this.swing(pelvicfinright, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.body.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
