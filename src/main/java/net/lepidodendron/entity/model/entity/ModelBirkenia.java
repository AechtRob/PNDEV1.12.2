package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBirkenia extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    public ModelBirkenia() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 33, 23, 0.075F, -5.3177F, -6.5885F, 1, 1, 1, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 33, 23, -1.075F, -5.3177F, -6.5885F, 1, 1, 1, 0.006F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -4.402F, -6.5469F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 20, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -2.082F, 2.2749F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 6, -0.5F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.3615F, 3.7295F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 35, -0.025F, -0.5F, -0.4F, 0, 1, 1, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1769F, 2.3274F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9163F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 0, 0.0F, 0.0F, 0.0F, 0, 1, 1, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.0384F, 1.2758F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 29, -0.5F, -0.75F, -0.3F, 0, 2, 1, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.9512F, -0.7223F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 23, -0.5F, -2.0F, 0.0F, 2, 2, 3, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -2.8073F, -1.9022F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1007F, -0.5214F, 0.0503F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 33, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -2.8073F, -1.9022F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1007F, 0.5214F, -0.0503F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 33, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.2127F, -3.7109F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, -0.5F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -2.9891F, -6.6086F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 21, -0.5F, -2.0F, 0.0F, 2, 2, 3, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -5.3417F, -6.889F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 33, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -5.7745F, -4.9364F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 27, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -6.0493F, -1.9385F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 21, -1.0F, -0.45F, -2.0F, 0, 1, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -6.4691F, -0.9971F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 9, -0.5F, 0.0F, -4.0F, 2, 2, 4, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -6.5925F, 2.4573F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 32, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.025F, -6.8115F, 2.2404F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 35, 0.0F, -0.675F, -0.15F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -6.3916F, 3.1818F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 3, 1.5F, -0.75F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -6.6F, 2.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 28, -0.5F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -6.6F, 2.0F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 14, -0.5F, 0.0F, -3.0F, 2, 3, 3, 0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.3782F, 3.4616F);
        this.main.addChild(tail);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, -1.658F, 1.3843F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 32, 1.5F, -0.65F, -0.225F, 0, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.8745F, 0.408F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 0, -0.5F, 0.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 0.9136F, 4.5466F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3077F, -0.149F, 0.5947F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 0, 0.0F, -0.45F, -4.0F, 0, 1, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.9136F, 4.5466F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3077F, 0.149F, -0.5947F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 0, 0.0F, -0.45F, -4.0F, 0, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.9489F, 0.6829F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 7, -0.5F, -2.0F, 0.0F, 2, 2, 4, -0.006F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.6F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 27, -0.25F, -1.0324F, -0.0033F, 1, 2, 2, 0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 27, -0.75F, -1.0324F, -0.0033F, 1, 2, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0324F, 1.9967F);
        this.tail2.addChild(tail3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -1.0077F, -0.0156F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.7418F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 29, 0.525F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.5F, -1.05F, -0.4F, 0, 2, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3927F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 14, -0.5F, -0.5F, -0.3F, 1, 1, 4, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.15F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.2F, 0.0F, 0.1F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.1F, 0.0F);
        this.main.offsetX = -0.004F;
        this.main.offsetY = 0.15F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.25F;
        this.main.offsetX = 0.75F;
        this.main.offsetZ = 1.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.1F, 0.0F);
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
        this.main.offsetY = -0.3F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.66F;
        if (!e.isInWater()) {
            speed = 0.99F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(main, speed, 0.16F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.0F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
