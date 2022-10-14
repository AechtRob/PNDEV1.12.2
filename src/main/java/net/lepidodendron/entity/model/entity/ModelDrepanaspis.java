package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelDrepanaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer fin;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r14;

    public ModelDrepanaspis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -3.0F, -5.0F, 8, 3, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 20, -3.99F, -2.0F, 1.925F, 8, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 10, -3.0F, -0.75F, -5.025F, 6, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 14, -0.5F, -3.125F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -3.0F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.8727F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 23, -1.25F, 0.025F, -1.5F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -3.0F, 2.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.8727F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 32, -0.75F, 0.025F, -1.5F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 3, -2.99F, -1.0F, -1.75F, 6, 1, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 29, -2.49F, -1.0F, -2.75F, 5, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, 0.15F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 6, -2.5F, -3.875F, -6.775F, 5, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.0F, -1.8F, -5.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5672F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 31, -0.15F, -0.25F, -2.85F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.0F, -2.0F, -5.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, -0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 8, 0.1F, 0.75F, -2.6F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.0F, -2.0F, -5.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 12, -1.1F, 0.75F, -2.6F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.0F, -2.125F, -5.1F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, -0.0873F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 5, 0.55F, -0.35F, -1.1F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.0F, -2.125F, -5.1F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0873F, 0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 15, -1.55F, -0.35F, -1.1F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.0F, -1.8F, -5.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 31, -0.85F, -0.25F, -2.85F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.0F, -4.85F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 0, -3.5F, 0.1F, -1.0F, 7, 2, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 29, -3.0F, 0.1F, -2.0F, 6, 2, 1, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(4.1F, -1.9F, -4.65F);
        this.body.addChild(bone3);
        this.setRotateAngle(bone3, -0.0175F, -0.1745F, -0.2618F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.0F, 1.5F, 4.75F);
        this.bone3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.1745F, -0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 10, 3.65F, 1.55F, -4.05F, 1, 1, 8, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-4.1F, -1.9F, -4.65F);
        this.body.addChild(bone2);
        this.setRotateAngle(bone2, -0.0175F, 0.1745F, 0.2618F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.0F, 1.5F, 4.75F);
        this.bone2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, -0.1745F, 0.7854F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 10, -4.65F, 1.55F, -4.05F, 1, 1, 8, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.75F, 1.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 28, -2.0F, -1.2F, 0.0F, 4, 3, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 28, 31, -0.5F, -1.325F, 0.0F, 1, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 20, 23, -1.5F, -1.199F, 0.0F, 3, 3, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 22, -0.5F, -1.335F, 0.0F, 1, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 29, 20, -1.0F, -1.2F, 0.0F, 2, 3, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 18, -0.5F, -1.325F, 0.0F, 1, 1, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.5F, -1.199F, 0.0F, 1, 3, 2, 0.0F, false));

        this.fin = new AdvancedModelRenderer(this);
        this.fin.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(fin);
        this.fin.cubeList.add(new ModelBox(fin, 19, 8, 0.0F, -1.7F, 0.0F, 0, 4, 2, 0.0F, false));
        this.fin.cubeList.add(new ModelBox(fin, 0, 7, 0.0F, -2.2F, 2.0F, 0, 5, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -2.825F, 0.025F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, 0.1745F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 35, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.5F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.body.offsetY = 0.8F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.fin};

        float speed = 0.35F;
        float taildegree = 0.125F;

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
            speed = 0.15F;
            taildegree = 0.095F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -2.0, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.8F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
