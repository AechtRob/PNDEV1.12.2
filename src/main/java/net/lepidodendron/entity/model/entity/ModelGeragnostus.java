package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGeragnostus;
import net.lepidodendron.entity.EntityPrehistoricFloraTegopelte;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelGeragnostus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer geragnostus;
    private final AdvancedModelRenderer cephalon;
    private final AdvancedModelRenderer anntennae1;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer thorax1;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer leg8;

    public ModelGeragnostus() {
        this.textureWidth = 20;
        this.textureHeight = 20;

        this.geragnostus = new AdvancedModelRenderer(this);
        this.geragnostus.setRotationPoint(0.0F, 23.35F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0F, -0.15F, -1.0F);
        this.geragnostus.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, -4, 4, -2.5F, -0.025F, -4.0F, 5, 0, 4, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 9, 13, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(0.75F, 0.1638F, -1.9994F);
        this.cephalon.addChild(anntennae1);
        this.setRotateAngle(anntennae1, -0.0873F, 0.0F, 0.0F);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, -3, 8, -0.5F, 0.0F, -2.975F, 1, 0, 3, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-0.75F, 0.1638F, -1.9994F);
        this.cephalon.addChild(anntennae2);
        this.setRotateAngle(anntennae2, -0.0873F, 0.0F, 0.0F);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, -3, 8, -0.5F, 0.0F, -2.975F, 1, 0, 3, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(1.197F, 0.3553F, -1.4196F);
        this.cephalon.addChild(leg1);
        this.setRotateAngle(leg1, 0.0873F, -0.3927F, 0.0F);
        this.leg1.cubeList.add(new ModelBox(leg1, 2, 8, -0.5706F, 0.0069F, -3.9992F, 2, 0, 4, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(1.1162F, 0.3909F, 0.0368F);
        this.cephalon.addChild(leg2);
        this.setRotateAngle(leg2, 0.0873F, -0.3927F, 0.0F);
        this.leg2.cubeList.add(new ModelBox(leg2, 2, 8, -0.4793F, -0.0028F, -3.989F, 2, 0, 4, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(-1.197F, 0.3553F, -1.4196F);
        this.cephalon.addChild(leg3);
        this.setRotateAngle(leg3, 0.0873F, 0.3927F, 0.0F);
        this.leg3.cubeList.add(new ModelBox(leg3, -2, 8, -1.4294F, 0.0069F, -3.9992F, 2, 0, 4, 0.0F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(-1.1162F, 0.3909F, 0.0368F);
        this.cephalon.addChild(leg4);
        this.setRotateAngle(leg4, 0.0873F, 0.3927F, 0.0F);
        this.leg4.cubeList.add(new ModelBox(leg4, -2, 8, -1.5207F, -0.0028F, -3.989F, 2, 0, 4, 0.0F, false));

        this.thorax1 = new AdvancedModelRenderer(this);
        this.thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cephalon.addChild(thorax1);
        this.thorax1.cubeList.add(new ModelBox(thorax1, 9, 0, -2.5F, 0.0F, 0.0F, 5, 0, 1, 0.0F, false));
        this.thorax1.cubeList.add(new ModelBox(thorax1, 10, 2, -1.5F, -0.5F, 0.0F, 3, 1, 1, 0.002F, false));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.thorax1.addChild(thorax2);
        this.thorax2.cubeList.add(new ModelBox(thorax2, 9, 0, -2.5F, 0.025F, 0.0F, 5, 0, 1, 0.0F, false));
        this.thorax2.cubeList.add(new ModelBox(thorax2, 10, 5, -1.5F, -0.5F, 0.0F, 3, 1, 1, 0.001F, false));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.thorax2.addChild(pygidium);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 13, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, -4, 0, -2.5F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(-1.0F, 0.25F, 1.0F);
        this.pygidium.addChild(leg5);
        this.setRotateAngle(leg5, -2.9671F, 0.0F, 3.1416F);
        this.leg5.cubeList.add(new ModelBox(leg5, -3, 8, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-1.2313F, 0.2576F, 0.0047F);
        this.pygidium.addChild(leg6);
        this.setRotateAngle(leg6, -2.9671F, 0.3927F, 3.1416F);
        this.leg6.cubeList.add(new ModelBox(leg6, -3, 8, -0.481F, 0.0166F, -3.0058F, 1, 0, 3, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(1.0F, 0.25F, 1.0F);
        this.pygidium.addChild(leg7);
        this.setRotateAngle(leg7, -0.1745F, 0.0F, 0.0F);
        this.leg7.cubeList.add(new ModelBox(leg7, -3, 8, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(1.1851F, 0.2576F, 0.0238F);
        this.pygidium.addChild(leg8);
        this.setRotateAngle(leg8, -0.1745F, 0.3927F, 0.0F);
        this.leg8.cubeList.add(new ModelBox(leg8, -3, 8, -0.431F, 0.0166F, 0.0058F, 1, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.geragnostus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.geragnostus.offsetY = -2.0F;
        this.geragnostus.offsetX = -1.338F;
        this.geragnostus.rotateAngleY = (float)Math.toRadians(200);
        this.geragnostus.rotateAngleX = (float)Math.toRadians(8);
        this.geragnostus.rotateAngleZ = (float)Math.toRadians(-8);
        this.geragnostus.scaleChildren = true;
        float scaler = 1.63F;
        this.geragnostus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.geragnostus.render(f);
        //Reset rotations, positions and sizing:
        this.geragnostus.setScale(1.0F, 1.0F, 1.0F);
        this.geragnostus.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.geragnostus.render(0.014F);
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
        //this.geragnostus.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leg1, this.leg2, this.leg8, this.leg7};
        AdvancedModelRenderer[] legsR = {this.leg3, this.leg4, this.leg6, this.leg5};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraGeragnostus) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.swing(leg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.swing(leg3, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.swing(leg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.swing(leg4, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.swing(leg8, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.swing(leg6, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.swing(leg7, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.swing(leg5, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);

            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.swing(leg1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(leg3, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.swing(leg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(leg4, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.swing(leg8, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(leg6, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.swing(leg7, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.swing(leg5, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
           }

        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}