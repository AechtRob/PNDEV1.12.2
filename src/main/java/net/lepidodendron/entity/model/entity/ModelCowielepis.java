package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCowielepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Cowielepis;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer FinL;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer FinL2;
    private final AdvancedModelRenderer cube_r13;

    public ModelCowielepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Cowielepis = new AdvancedModelRenderer(this);
        this.Cowielepis.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Cowielepis.cubeList.add(new ModelBox(Cowielepis, 41, 25, -2.0F, -9.4F, -8.1F, 4, 7, 4, 0.002F, false));
        this.Cowielepis.cubeList.add(new ModelBox(Cowielepis, 0, 0, -2.5F, -10.4F, -4.2F, 5, 8, 11, 0.0F, false));
        this.Cowielepis.cubeList.add(new ModelBox(Cowielepis, 25, 29, -1.0F, -10.8F, -4.1F, 2, 1, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.6F, -4.6F);
        this.Cowielepis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.9774F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 50, -0.5F, -2.0072F, -0.1F, 1, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -10.6F, -3.2F);
        this.Cowielepis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.0647F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 13, -0.5F, -8.0465F, 3.2171F, 1, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 34, -0.5F, -6.0465F, 2.1171F, 1, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 42, -0.5F, -4.4465F, 1.2171F, 1, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 0, -0.5F, -2.7465F, 0.3171F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -10.6F, -5.4F);
        this.Cowielepis.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8203F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 51, -0.5F, -0.7F, -0.7F, 1, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -10.4F, -6.9F);
        this.Cowielepis.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 0, -2.0F, -0.0054F, 0.0587F, 4, 2, 3, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -11.0F, -7.0F);
        this.Cowielepis.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 42, -2.0F, 0.6F, -5.0F, 4, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -7.3F, -12.2F);
        this.Cowielepis.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2793F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 44, -2.0F, -1.8865F, 0.0321F, 4, 2, 4, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.75F, -10.3F);
        this.Cowielepis.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.021F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 13, -2.0F, -3.6707F, -3.0215F, 4, 4, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.75F, -7.0F);
        this.Cowielepis.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4451F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 50, -2.0F, -2.35F, -3.2F, 4, 4, 3, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.0F, 7.0F);
        this.Cowielepis.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 33, 0, -2.0F, -2.9F, -0.5F, 4, 6, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.6F, -10.2F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.1868F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 6, -0.5F, -13.6465F, 5.9171F, 1, 2, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 5, 23, -0.5F, -12.7465F, 5.4171F, 1, 2, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 26, -0.5F, -11.5465F, 4.9171F, 1, 2, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 29, -0.5F, -10.1465F, 4.1171F, 1, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.35F, 5.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 42, -1.5F, -2.25F, 0.0F, 3, 4, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 11, 46, 0.0F, 1.75F, -1.0F, 0, 3, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.95F, -15.7F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.1868F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, -17.8465F, 8.9171F, 1, 2, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 5, -0.5F, -16.9465F, 8.4171F, 1, 2, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 20, -0.5F, -16.0465F, 7.9171F, 1, 2, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 20, -0.5F, -14.9465F, 7.4171F, 1, 2, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0038F, 5.0634F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 20, 0.0F, -6.2462F, -0.0634F, 0, 11, 12, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.7538F, 0.9366F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5498F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 13, -1.0F, -1.75F, -2.4F, 2, 2, 8, 0.0F, false));

        this.FinL = new AdvancedModelRenderer(this);
        this.FinL.setRotationPoint(2.5F, -3.6F, -2.0F);
        this.Cowielepis.addChild(FinL);
        this.setRotateAngle(FinL, 0.0F, 0.0F, 0.2182F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.9F, -0.7F);
        this.FinL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.6894F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 20, -1.0F, 0.6F, -1.4F, 7, 0, 8, 0.0F, false));

        this.FinL2 = new AdvancedModelRenderer(this);
        this.FinL2.setRotationPoint(-2.5F, -3.6F, -2.0F);
        this.Cowielepis.addChild(FinL2);
        this.setRotateAngle(FinL2, 0.0F, 0.0F, -0.2182F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.9F, -0.7F);
        this.FinL2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.6894F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 20, -6.0F, 0.6F, -1.4F, 7, 0, 8, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Cowielepis.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Cowielepis.rotateAngleY = (float) Math.toRadians(90);
        this.Cowielepis.offsetY = -0.2F;
        this.Cowielepis.offsetX = -0.0F;
        this.Cowielepis.offsetZ = -1.2F;
        this.Cowielepis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Cowielepis, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.15F, 0.0F);
        this.Cowielepis.offsetY = -0.25F;
        this.Cowielepis.render(0.01F);
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
        //this.Birkenia.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.66F;
        if (!e.isInWater()) {
            speed = 0.99F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            //this.flap(FinL, (float) (speed * 0.65), 0.15F , true, 0.8F, 0.3F, f2, 1);
            //this.swing(FinL, (float) (speed * 0.65), 0.15F, true, 0, 0, f2, 1);
            //this.flap(FinL2, (float) (speed * 0.65), -0.15F, true, 0.8F, -0.3F, f2, 1);
            //this.swing(FinL2, (float) (speed * 0.65), -0.15F , true, 0, 0, f2, 1);
            this.swing(Cowielepis, speed, 0.16F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Cowielepis.rotateAngleZ = (float) Math.toRadians(90);
                //this.Birkenia.offsetY = 1.20F;
                this.bob(Cowielepis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
