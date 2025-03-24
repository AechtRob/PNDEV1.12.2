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
        textureWidth = 20;
        textureHeight = 15;

        geragnostus = new AdvancedModelRenderer(this);
        geragnostus.setRotationPoint(0.0F, 23.35F, 0.0F);


        cephalon = new AdvancedModelRenderer(this);
        cephalon.setRotationPoint(0.0F, -0.15F, -1.0F);
        geragnostus.addChild(cephalon);
        cephalon.cubeList.add(new ModelBox(cephalon, -3, 5, -2.5F, -0.025F, -4.0F, 5, 0, 3, 0.0F, false));
        cephalon.cubeList.add(new ModelBox(cephalon, 12, 9, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        cephalon.cubeList.add(new ModelBox(cephalon, 10, 0, -2.0F, -0.025F, -1.0F, 4, 0, 1, 0.0F, false));

        anntennae1 = new AdvancedModelRenderer(this);
        anntennae1.setRotationPoint(0.75F, 0.1638F, -1.9994F);
        cephalon.addChild(anntennae1);
        setRotateAngle(anntennae1, -0.0873F, 0.0F, 0.0F);
        anntennae1.cubeList.add(new ModelBox(anntennae1, -3, 9, -0.5F, 0.0F, -2.975F, 1, 0, 3, 0.0F, false));

        anntennae2 = new AdvancedModelRenderer(this);
        anntennae2.setRotationPoint(-0.75F, 0.1638F, -1.9994F);
        cephalon.addChild(anntennae2);
        setRotateAngle(anntennae2, -0.0873F, 0.0F, 0.0F);
        anntennae2.cubeList.add(new ModelBox(anntennae2, -3, 9, -0.5F, 0.0F, -2.975F, 1, 0, 3, 0.0F, false));

        leftleg1 = new AdvancedModelRenderer(this);
        leftleg1.setRotationPoint(0.947F, 0.3553F, -1.4196F);
        cephalon.addChild(leftleg1);
        setRotateAngle(leftleg1, 0.0873F, -0.3927F, 0.0F);
        leftleg1.cubeList.add(new ModelBox(leftleg1, -2, 10, -0.5706F, 0.0069F, -1.9992F, 1, 0, 2, 0.0F, false));

        rightleg1 = new AdvancedModelRenderer(this);
        rightleg1.setRotationPoint(-0.947F, 0.3553F, -1.4196F);
        cephalon.addChild(rightleg1);
        setRotateAngle(rightleg1, 0.0873F, 0.3927F, 0.0F);
        rightleg1.cubeList.add(new ModelBox(rightleg1, -2, 10, -0.4294F, 0.0069F, -1.9992F, 1, 0, 2, 0.0F, true));

        leftleg2 = new AdvancedModelRenderer(this);
        leftleg2.setRotationPoint(0.8662F, 0.3909F, -0.2132F);
        cephalon.addChild(leftleg2);
        setRotateAngle(leftleg2, 0.0873F, -0.3927F, 0.0F);
        leftleg2.cubeList.add(new ModelBox(leftleg2, -2, 9, -0.4793F, -0.0028F, -1.989F, 1, 0, 2, 0.0F, false));

        rightleg2 = new AdvancedModelRenderer(this);
        rightleg2.setRotationPoint(-0.8662F, 0.3909F, -0.2132F);
        cephalon.addChild(rightleg2);
        setRotateAngle(rightleg2, 0.0873F, 0.3927F, 0.0F);
        rightleg2.cubeList.add(new ModelBox(rightleg2, -2, 9, -0.5207F, -0.0028F, -1.989F, 1, 0, 2, 0.0F, true));

        thorax1 = new AdvancedModelRenderer(this);
        thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        cephalon.addChild(thorax1);
        thorax1.cubeList.add(new ModelBox(thorax1, 13, 0, 0.3F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        thorax1.cubeList.add(new ModelBox(thorax1, 13, 0, -1.3F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        thorax1.cubeList.add(new ModelBox(thorax1, 11, 2, -1.0F, -0.4F, 0.0F, 2, 1, 1, 0.002F, false));

        thorax2 = new AdvancedModelRenderer(this);
        thorax2.setRotationPoint(0.0F, 0.0F, 1.0F);
        thorax1.addChild(thorax2);
        setRotateAngle(thorax2, 0.0F, 0.0F, 0.0F);
        thorax2.cubeList.add(new ModelBox(thorax2, 13, 0, 0.3F, 0.025F, 0.0F, 1, 0, 1, 0.0F, false));
        thorax2.cubeList.add(new ModelBox(thorax2, 13, 0, -1.3F, 0.025F, 0.0F, 1, 0, 1, 0.0F, false));
        thorax2.cubeList.add(new ModelBox(thorax2, 11, 5, -1.0F, -0.4F, 0.0F, 2, 1, 1, 0.001F, false));

        pygidium = new AdvancedModelRenderer(this);
        pygidium.setRotationPoint(0.0F, 0.0F, 1.0F);
        thorax2.addChild(pygidium);
        setRotateAngle(pygidium, 0.0F, 0.0F, 0.0F);
        pygidium.cubeList.add(new ModelBox(pygidium, 3, 9, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));
        pygidium.cubeList.add(new ModelBox(pygidium, -3, 0, -2.5F, 0.0F, 1.0F, 5, 0, 3, 0.0F, false));
        pygidium.cubeList.add(new ModelBox(pygidium, 10, 0, -2.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        leftleg3 = new AdvancedModelRenderer(this);
        leftleg3.setRotationPoint(0.9351F, 0.2576F, 0.5238F);
        pygidium.addChild(leftleg3);
        setRotateAngle(leftleg3, -0.1745F, 0.3927F, 0.0F);
        leftleg3.cubeList.add(new ModelBox(leftleg3, -2, 10, -0.431F, 0.0166F, 0.0058F, 1, 0, 2, 0.0F, false));

        rightleg3 = new AdvancedModelRenderer(this);
        rightleg3.setRotationPoint(-0.9351F, 0.2576F, 0.5238F);
        pygidium.addChild(rightleg3);
        setRotateAngle(rightleg3, -0.1745F, -0.3927F, 0.0F);
        rightleg3.cubeList.add(new ModelBox(rightleg3, -2, 10, -0.569F, 0.0166F, 0.0058F, 1, 0, 2, 0.0F, true));

        leftleg4 = new AdvancedModelRenderer(this);
        leftleg4.setRotationPoint(1.0F, 0.25F, 1.5F);
        pygidium.addChild(leftleg4);
        setRotateAngle(leftleg4, -0.1745F, 0.0F, 0.0F);
        leftleg4.cubeList.add(new ModelBox(leftleg4, -2, 9, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        rightleg4 = new AdvancedModelRenderer(this);
        rightleg4.setRotationPoint(-1.0F, 0.25F, 1.5F);
        pygidium.addChild(rightleg4);
        setRotateAngle(rightleg4, -0.1745F, 0.0F, 0.0F);
        rightleg4.cubeList.add(new ModelBox(rightleg4, -2, 9, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.geragnostus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.geragnostus.offsetY = -1.60F;
        this.geragnostus.offsetX = 0.0F;
        this.geragnostus.rotateAngleY = (float)Math.toRadians(202);
        this.geragnostus.rotateAngleX = (float)Math.toRadians(22);
        this.geragnostus.rotateAngleZ = (float)Math.toRadians(-12);
        this.geragnostus.scaleChildren = true;
        float scaler = 4.80F;
        this.geragnostus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.geragnostus.render(f);
        //Reset rotations, positions and sizing:
        this.geragnostus.setScale(1.0F, 1.0F, 1.0F);
        this.geragnostus.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(geragnostus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cephalon, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(thorax1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(thorax2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(pygidium, 0.0F, 0.1F, 0.0F);
        this.geragnostus.offsetY = 0.06F;
        this.geragnostus.offsetZ = 0.016F;
        this.geragnostus.render(0.01F);
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