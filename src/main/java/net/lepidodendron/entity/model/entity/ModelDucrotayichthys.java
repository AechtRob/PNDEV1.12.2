package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDucrotayichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightCl;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r24;

    public ModelDucrotayichthys() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 9, -1.5F, -6.35F, -2.25F, 3, 5, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 15, -1.0F, -4.425F, -4.575F, 2, 2, 3, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.459F, -4.6275F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5105F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 15, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.0344F, -6.2994F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2487F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 5, -0.5F, -1.0F, -0.275F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -5.7486F, -4.1574F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.1126F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 9, -0.5F, 0.0F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.35F, -2.25F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 13, -0.5F, -0.1F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -6.7168F, -4.3461F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 33, 0.5F, -0.575F, 0.125F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.4405F, -3.9971F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, -0.5F, -1.975F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -6.35F, -2.25F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 21, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -4.425F, -2.575F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 10, -0.025F, -0.5F, -0.875F, 1, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 10, 1.025F, -0.5F, -0.875F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -6.35F, -1.25F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0472F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 30, 0.5F, 1.15F, 2.5F, 0, 1, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, 0.9F, 0.0F, 1, 1, 7, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.35F, -1.25F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 24, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.leftCl = new AdvancedModelRenderer(this);
        this.leftCl.setRotationPoint(1.5F, -2.2841F, -1.2461F);
        this.main.addChild(leftCl);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.7859F, 1.5132F, 1.2633F);
        this.leftCl.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.01F, 0.4139F, -0.7954F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 7, -0.5F, -1.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.075F, 0.6841F, -0.3539F);
        this.leftCl.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7954F, 0.4139F, -0.7954F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 18, -0.5F, -1.825F, -0.4F, 1, 2, 3, 0.0F, false));

        this.rightCl = new AdvancedModelRenderer(this);
        this.rightCl.setRotationPoint(-1.5F, -2.2841F, -1.2461F);
        this.main.addChild(rightCl);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.7859F, 1.5132F, 1.2633F);
        this.rightCl.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.01F, -0.4139F, 0.7954F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 7, -0.5F, -1.0F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.075F, 0.6841F, -0.3539F);
        this.rightCl.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7954F, -0.4139F, 0.7954F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 18, -0.5F, -1.825F, -0.4F, 1, 2, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.6077F, -2.3463F);
        this.main.addChild(jaw);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 2.0907F, -1.1293F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 26, -0.5F, -1.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.668F, -2.0356F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4363F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 12, -0.5F, -1.0F, 0.0F, 2, 1, 1, -0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.3577F, -0.0537F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4363F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 19, 0.0F, -0.9F, -2.25F, 1, 1, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 0, -0.5F, -0.65F, -2.35F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.5967F, -0.017F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 9, 21, -0.75F, -1.4033F, 0.017F, 2, 3, 2, 0.003F, false));
        this.tail.cubeList.add(new ModelBox(tail, 9, 21, -1.25F, -1.4033F, 0.017F, 2, 3, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, -1.2391F, 2.1812F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.0908F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 18, 1.975F, -1.0F, -0.3F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 0, 1.0F, 0.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, -2.6533F, 0.767F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7854F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 31, 2.0F, -2.0F, 1.0F, 0, 2, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 27, 1.0F, 0.0F, 0.0F, 2, 1, 2, 0.006F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.0F, 1.8827F, 1.4481F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.8247F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 31, 2.0F, -0.45F, -0.6F, 0, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 2.1967F, 0.767F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.432F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 27, 19, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5467F, 2.017F);
        this.tail.addChild(tail2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 29, -1.0F, -0.125F, -0.5F, 2, 1, 2, 0.006F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 23, -1.0F, -0.775F, -0.5F, 2, 1, 2, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4256F, 1.9734F);
        this.tail2.addChild(tail3);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.48F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 5, 0.5F, -0.65F, -0.175F, 0, 3, 3, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 33, 4, 0.0F, -0.65F, -0.175F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 8.0F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);



            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
//                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
