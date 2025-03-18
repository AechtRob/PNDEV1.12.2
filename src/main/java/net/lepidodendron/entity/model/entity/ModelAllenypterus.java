package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAllenypterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Allenypterus;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PelvicR;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;

    public ModelAllenypterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Allenypterus = new AdvancedModelRenderer(this);
        this.Allenypterus.setRotationPoint(0.0F, 18.0F, 0.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Allenypterus.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 38, 0, -1.5F, -3.2F, -3.0F, 3, 6, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.6F, 0.1F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2793F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 41, -1.0F, -1.9873F, -2.8555F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.8F, -3.4F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8203F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 31, -1.0F, -3.0138F, -0.0105F, 2, 3, 3, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 10, -1.0F, -5.3F, -2.4F, 2, 5, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.1F, -1.8F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1833F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -1.5F, -0.4578F, -0.3516F, 3, 1, 1, 0.04F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 15, -1.5F, -0.9578F, -0.8516F, 3, 2, 2, 0.03F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -2.9F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1222F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0868F, 0.6192F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 7, -1.0F, -0.1782F, -2.6995F, 2, 1, 3, -0.001F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 1.0F, -5.2F);
        this.Allenypterus.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 25, 26, -1.5F, -4.4F, 0.0F, 3, 8, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.0F, 8.0F);
        this.Body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2967F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 24, 0.0F, -0.5F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.9F, 3.0F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4887F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 31, 0.0F, -4.1F, -0.5F, 0, 4, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.3F, 0.0F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2967F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 46, 0.0F, -4.7F, -1.2F, 0, 6, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.2F, 2.9F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 40, -1.0F, -1.0F, -1.7F, 2, 4, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -5.7F, -1.0F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4887F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 23, -1.0F, -0.3F, -0.2F, 2, 4, 3, -0.001F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-1.5F, -1.75F, 1.75F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, -0.48F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 9, 33, 0.0F, -2.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(1.5F, -1.75F, 1.75F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.48F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 9, 33, 0.0F, -2.0F, 0.0F, 0, 4, 6, 0.0F, true));

        this.PelvicR = new AdvancedModelRenderer(this);
        this.PelvicR.setRotationPoint(-1.5F, 2.8F, 3.1F);
        this.Body1.addChild(PelvicR);
        this.setRotateAngle(PelvicR, 0.0F, 0.0F, 0.6109F);
        this.PelvicR.cubeList.add(new ModelBox(PelvicR, 31, 0, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(1.5F, 2.8F, 3.1F);
        this.Body1.addChild(PelvicL);
        this.setRotateAngle(PelvicL, 0.0F, 0.0F, -0.6109F);
        this.PelvicL.cubeList.add(new ModelBox(PelvicL, 31, 0, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.0F, 5.05F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 19, 0, -1.0F, -2.4F, -0.25F, 2, 7, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -5.5F, 0.55F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4189F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 24, 0.0F, -3.5F, -0.1F, 0, 7, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.2F, -0.05F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.384F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 16, -0.5F, 0.1767F, -0.1292F, 1, 6, 8, 0.001F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.9F, 6.7F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 30, 15, -1.0F, -1.3F, -0.25F, 2, 5, 5, -0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 17, 39, 0.0F, 3.1F, -0.25F, 0, 4, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -0.9F, 1.75F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3665F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 39, -1.0F, -3.4F, -2.5F, 0, 6, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -4.2F, 1.35F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3665F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 35, -1.5F, 0.7F, -1.2F, 1, 3, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.1F, 0.4F, 4.8F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, -0.1F, -7.3F, -0.05F, 0, 14, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.9F, 1.9F, 3.25F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4363F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 0, -1.5F, -2.0491F, 0.2183F, 1, 2, 4, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.9F, 3.1F, -0.15F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4189F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 44, -1.5F, -1.8027F, -0.0795F, 1, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.9F, -2.3F, 2.95F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2269F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 3, -1.5F, 2.4F, -0.2F, 1, 1, 1, -0.002F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 16, -1.5F, 0.4F, -0.2F, 1, 2, 3, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -1.5F, 0.4F, -3.2F, 1, 4, 3, -0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Allenypterus.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Allenypterus, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.Allenypterus.offsetZ = -0.0F;
        this.Allenypterus.offsetY = 0.2F;
        this.Allenypterus.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Allenypterus.offsetY = -3.0F;
        this.Allenypterus.offsetX = 0.9F;
        this.Allenypterus.offsetZ = 2.8F;
        this.Allenypterus.rotateAngleY = (float) Math.toRadians(210);
        this.Allenypterus.rotateAngleX = (float) Math.toRadians(8);
        this.Allenypterus.rotateAngleZ = (float) Math.toRadians(-4);
        this.Allenypterus.scaleChildren = true;
        float scaler = 7.5F;
        this.Allenypterus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Allenypterus, 0.2F, 3.9F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Allenypterus.render(f);
        //Reset rotations, positions and sizing:
        this.Allenypterus.setScale(1.0F, 1.0F, 1.0F);
        this.Allenypterus.scaleChildren = false;
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
        //this.Allenypterus.offsetY = 1.3F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4};

        float speed = 0.485F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.185F;
            taildegree = 0.25F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, taildegree*0.8F, -3.25, f2, 1);
            this.swing(Allenypterus, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(PelvicR, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Allenypterus.rotateAngleZ = (float) Math.toRadians(90);
                //this.Allenypterus.offsetY = 1.3F;
                this.bob(Allenypterus, -speed, 2F, false, f2, 1);
                this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
