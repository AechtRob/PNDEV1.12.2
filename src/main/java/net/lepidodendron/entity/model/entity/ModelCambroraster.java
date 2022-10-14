package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCambroraster extends AdvancedModelBase {
    private final AdvancedModelRenderer bodybase;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tailfinR;
    private final AdvancedModelRenderer tailfinL;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer fin8;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer fin7;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer fin4;
    private final AdvancedModelRenderer fin3;
    private final AdvancedModelRenderer fin2;
    private final AdvancedModelRenderer fin1;
    private final AdvancedModelRenderer apepndageL2;
    private final AdvancedModelRenderer apepndageL;

    public ModelCambroraster() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 26, 13, -2.99F, -3.5F, -5.0F, 6, 3, 5, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 0, -3.5F, -4.5F, -5.25F, 7, 0, 9, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 13, 2.5F, -4.4F, -1.25F, 1, 1, 2, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 16, -3.5F, -4.4F, -1.25F, 1, 1, 2, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 6, -1.0F, -1.1F, -4.8F, 2, 1, 2, 0.0F, false));
        this.bodybase.cubeList.add(new ModelBox(bodybase, 5, 20, -0.5F, -1.09F, -4.3F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, 2.95F, -2.85F, -5.15F, 2, 4, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 17, -4.95F, -2.85F, -5.15F, 2, 4, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodybase.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 30, -3.0F, -0.7F, -6.85F, 6, 3, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.25F, 0.0F);
        this.bodybase.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 25, 2, -2.5F, -1.25F, 0.0F, 5, 3, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 13, 13, -2.0F, -1.0F, 0.0F, 4, 2, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.tailfinR = new AdvancedModelRenderer(this);
        this.tailfinR.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.body3.addChild(tailfinR);
        this.setRotateAngle(tailfinR, 0.0F, -0.0436F, 0.0F);
        this.tailfinR.cubeList.add(new ModelBox(tailfinR, 2, 1, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tailfinL = new AdvancedModelRenderer(this);
        this.tailfinL.setRotationPoint(0.1F, 0.0F, 0.5F);
        this.body3.addChild(tailfinL);
        this.setRotateAngle(tailfinL, 0.0F, 0.0436F, 0.0F);
        this.tailfinL.cubeList.add(new ModelBox(tailfinL, 1, 4, -0.1F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-1.0F, -0.25F, 0.25F);
        this.body3.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 0, 0, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin8 = new AdvancedModelRenderer(this);
        this.fin8.setRotationPoint(1.0F, -0.25F, 0.25F);
        this.body3.addChild(fin8);
        this.fin8.cubeList.add(new ModelBox(fin8, 4, 19, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-2.0F, -0.4F, 0.5F);
        this.body2.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 0, 1, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin7 = new AdvancedModelRenderer(this);
        this.fin7.setRotationPoint(2.0F, -0.4F, 0.5F);
        this.body2.addChild(fin7);
        this.fin7.cubeList.add(new ModelBox(fin7, 6, 19, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-2.5F, -0.25F, 3.5F);
        this.body1.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 4, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-2.5F, -0.25F, 2.5F);
        this.body1.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 0, 5, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-2.5F, -0.25F, 1.5F);
        this.body1.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 18, 16, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-2.5F, -0.25F, 0.5F);
        this.body1.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 18, 17, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin4 = new AdvancedModelRenderer(this);
        this.fin4.setRotationPoint(2.5F, -0.25F, 3.5F);
        this.body1.addChild(fin4);
        this.fin4.cubeList.add(new ModelBox(fin4, 14, 20, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin3 = new AdvancedModelRenderer(this);
        this.fin3.setRotationPoint(2.5F, -0.25F, 2.5F);
        this.body1.addChild(fin3);
        this.fin3.cubeList.add(new ModelBox(fin3, 20, 16, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin2 = new AdvancedModelRenderer(this);
        this.fin2.setRotationPoint(2.5F, -0.25F, 1.5F);
        this.body1.addChild(fin2);
        this.fin2.cubeList.add(new ModelBox(fin2, 0, 21, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.fin1 = new AdvancedModelRenderer(this);
        this.fin1.setRotationPoint(2.5F, -0.25F, 0.5F);
        this.body1.addChild(fin1);
        this.fin1.cubeList.add(new ModelBox(fin1, 2, 21, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.apepndageL2 = new AdvancedModelRenderer(this);
        this.apepndageL2.setRotationPoint(-1.25F, -1.25F, -4.25F);
        this.bodybase.addChild(apepndageL2);
        this.setRotateAngle(apepndageL2, -0.3491F, 0.2618F, 0.0F);
        this.apepndageL2.cubeList.add(new ModelBox(apepndageL2, 13, 16, -0.5F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));
        this.apepndageL2.cubeList.add(new ModelBox(apepndageL2, 2, 13, -0.5F, 1.35F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL2.cubeList.add(new ModelBox(apepndageL2, 4, 6, -0.5F, 1.7F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL2.cubeList.add(new ModelBox(apepndageL2, 5, 4, -0.5F, 2.05F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL2.cubeList.add(new ModelBox(apepndageL2, 5, 2, -0.5F, 2.4F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL2.cubeList.add(new ModelBox(apepndageL2, 5, 0, -0.5F, 2.75F, 0.0F, 1, 0, 2, 0.0F, false));

        this.apepndageL = new AdvancedModelRenderer(this);
        this.apepndageL.setRotationPoint(1.25F, -1.25F, -4.25F);
        this.bodybase.addChild(apepndageL);
        this.setRotateAngle(apepndageL, -0.3491F, -0.2618F, 0.0F);
        this.apepndageL.cubeList.add(new ModelBox(apepndageL, 17, 18, -0.5F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));
        this.apepndageL.cubeList.add(new ModelBox(apepndageL, 4, 17, -0.5F, 1.35F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL.cubeList.add(new ModelBox(apepndageL, 15, 16, -0.5F, 1.7F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL.cubeList.add(new ModelBox(apepndageL, 2, 16, -0.5F, 2.05F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL.cubeList.add(new ModelBox(apepndageL, 4, 15, -0.5F, 2.4F, 0.0F, 1, 0, 2, 0.0F, false));
        this.apepndageL.cubeList.add(new ModelBox(apepndageL, 4, 13, -0.5F, 2.75F, 0.0F, 1, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bodybase.render(f5 * 0.65F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.bodybase.render(0.04F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.bodybase.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.body1, this.body2, this.body3};
        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            this.swing(apepndageL, 0.8F, -0.4F, false, 3, -0.1F, f2, 0.8F);
            this.swing(apepndageL2, 0.8F, 0.4F, false, 3, 0.1F, f2, 0.8F);
            this.walk(apepndageL, 0.8F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.walk(apepndageL2, 0.8F, 0.2F, false, 0, -0.2F, f2, 0.8F);

            if (f3 != 0) {
                this.chainWave(Tail, 0.65F, 0.045F, -1.5, f2, 0.8F);
            }
            else {
                this.chainWave(Tail, 0.25F, 0.015F, -1.5, f2, 0.8F);
            }

            float degreeFin = 0.45F;
            this.flap(fin8, 0.5F, -degreeFin, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(finR8, 0.5F, degreeFin, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(fin7, 0.5F, -degreeFin, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(finR7, 0.5F, degreeFin, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(fin4, 0.5F, -degreeFin, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(finR4, 0.5F, degreeFin, false, 5.5F, 0.5F, f2, 0.7F);
            this.flap(fin3, 0.5F, -degreeFin, false, 6.0F, -0.5F, f2, 0.7F);
            this.flap(finR3, 0.5F, degreeFin, false, 6.0F, 0.5F, f2, 0.7F);
            this.flap(fin2, 0.5F, -degreeFin, false, 6.5F, -0.5F, f2, 0.7F);
            this.flap(finR2, 0.5F, degreeFin, false, 6.5F, 0.5F, f2, 0.7F);
            this.flap(fin1, 0.5F, -degreeFin, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(finR1, 0.5F, degreeFin, false, 7.0F, 0.5F, f2, 0.7F);

            this.walk(tailfinL, 1.0F, 0.2F, false, 0F, 0F, f2, 1F);
            this.walk(tailfinR, 1.0F, 0.2F, false, 0F, 0F, f2, 1F);
            this.swing(tailfinL, 1.4F, 0.2F, false, 0, 0F, f2, 0.7F);
            this.swing(tailfinR, 1.4F, -0.2F, false, 0, 0F, f2, 0.7F);


            if (!e.isInWater()) {
                this.bob(bodybase, -speed * 1.5F, 3F, false, f2, 1);
            } else {
                if (!isAtBottom) {
                    this.bob(bodybase, -speed, 0.12F, false, f2, 2);
                }
            }
        }
    }
}