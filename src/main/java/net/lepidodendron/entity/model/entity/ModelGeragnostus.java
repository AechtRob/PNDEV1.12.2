package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGeragnostus;
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
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer thorax1;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg4;

    public ModelGeragnostus() {
        this.textureWidth = 20;
        this.textureHeight = 15;

        this.geragnostus = new AdvancedModelRenderer(this);
        this.geragnostus.setRotationPoint(0.0F, 23.35F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0F, -0.15F, -1.0F);
        this.geragnostus.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, -4, 5, -2.5F, -0.025F, -4.0F, 5, 0, 3, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 12, 9, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 10, 0, -2.0F, -0.025F, -1.0F, 4, 0, 1, 0.0F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(0.75F, 0.1638F, -1.9994F);
        this.cephalon.addChild(anntennae1);
        this.setRotateAngle(anntennae1, -0.0873F, 0.0F, 0.0F);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, -3, 9, -0.5F, 0.0F, -2.975F, 1, 0, 3, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-0.75F, 0.1638F, -1.9994F);
        this.cephalon.addChild(anntennae2);
        this.setRotateAngle(anntennae2, -0.0873F, 0.0F, 0.0F);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, -3, 9, -0.5F, 0.0F, -2.975F, 1, 0, 3, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(0.947F, 0.3553F, -1.4196F);
        this.cephalon.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0873F, -0.3927F, 0.0F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, -2, 10, -0.5706F, 0.0069F, -1.9992F, 1, 0, 2, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-0.947F, 0.3553F, -1.4196F);
        this.cephalon.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0873F, 0.3927F, 0.0F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, -2, 10, -0.4294F, 0.0069F, -1.9992F, 1, 0, 2, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.8662F, 0.3909F, -0.2132F);
        this.cephalon.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0873F, -0.3927F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, -2, 9, -0.4793F, -0.0028F, -1.989F, 1, 0, 2, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.8662F, 0.3909F, -0.2132F);
        this.cephalon.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0873F, 0.3927F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, -2, 9, -0.5207F, -0.0028F, -1.989F, 1, 0, 2, 0.0F, true));

        this.thorax1 = new AdvancedModelRenderer(this);
        this.thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cephalon.addChild(thorax1);
        this.thorax1.cubeList.add(new ModelBox(thorax1, 13, 0, 0.3F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        this.thorax1.cubeList.add(new ModelBox(thorax1, 13, 0, -1.3F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        this.thorax1.cubeList.add(new ModelBox(thorax1, 11, 2, -1.0F, -0.4F, 0.0F, 2, 1, 1, 0.002F, false));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.thorax1.addChild(thorax2);
        this.setRotateAngle(thorax2, 0.0F, 0.0F, 0.0F);
        this.thorax2.cubeList.add(new ModelBox(thorax2, 13, 0, 0.3F, 0.025F, 0.0F, 1, 0, 1, 0.0F, false));
        this.thorax2.cubeList.add(new ModelBox(thorax2, 13, 0, -1.3F, 0.025F, 0.0F, 1, 0, 1, 0.0F, false));
        this.thorax2.cubeList.add(new ModelBox(thorax2, 11, 5, -1.0F, -0.4F, 0.0F, 2, 1, 1, 0.001F, false));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.thorax2.addChild(pygidium);
        this.setRotateAngle(pygidium, 0.0F, 0.0F, 0.0F);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 3, 9, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, -3, 0, -2.5F, 0.0F, 1.0F, 5, 0, 3, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 10, 0, -2.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.9351F, 0.2576F, 0.5238F);
        this.pygidium.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.1745F, 0.3927F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, -2, 10, -0.431F, 0.0166F, 0.0058F, 1, 0, 2, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.9351F, 0.2576F, 0.5238F);
        this.pygidium.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.1745F, -0.3927F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, -2, 10, -0.569F, 0.0166F, 0.0058F, 1, 0, 2, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(1.0F, 0.25F, 1.5F);
        this.pygidium.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.1745F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, -2, 9, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-1.0F, 0.25F, 1.5F);
        this.pygidium.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.1745F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, -2, 9, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

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

        AdvancedModelRenderer[] legsL = {this.leftleg1, this.leftleg2, this.leftleg3, this.leftleg4};
        AdvancedModelRenderer[] legsR = {this.rightleg1, this.rightleg2, this.rightleg3, this.rightleg4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraGeragnostus) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.swing(leftleg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.swing(rightleg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.swing(leftleg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.swing(rightleg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.swing(leftleg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.swing(rightleg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.swing(leftleg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.swing(rightleg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);

            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.swing(leftleg1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(rightleg1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.swing(leftleg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(rightleg2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.swing(leftleg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(rightleg3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.swing(leftleg4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.swing(rightleg4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
           }

        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}