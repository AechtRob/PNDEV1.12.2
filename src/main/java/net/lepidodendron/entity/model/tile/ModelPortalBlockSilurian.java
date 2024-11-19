package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockSilurian extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer tentacleroot1;
    private final AdvancedModelRenderer tentacles1;
    private final AdvancedModelRenderer tentaclea2;
    private final AdvancedModelRenderer tentaclea3;
    private final AdvancedModelRenderer tentaclea4;
    private final AdvancedModelRenderer tentacleroot2;
    private final AdvancedModelRenderer tentacleb1;
    private final AdvancedModelRenderer tentacleb2;
    private final AdvancedModelRenderer tentacleb3;
    private final AdvancedModelRenderer tentacleb4;
    private final AdvancedModelRenderer tentacleb5;
    private final AdvancedModelRenderer tentacleb6;

    public ModelPortalBlockSilurian() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F, false));

        tentacleroot1 = new AdvancedModelRenderer(this);
        tentacleroot1.setRotationPoint(0.0F, 9.0F, -4.0F);


        tentacles1 = new AdvancedModelRenderer(this);
        tentacles1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tentacleroot1.addChild(tentacles1);
        tentacleroot1.scaleChildren = true;
        tentacles1.cubeList.add(new ModelBox(tentacles1, 0, 32, -0.5F, -3.0F, -0.5F, 1, 4, 1, 0.0F, false));

        tentaclea2 = new AdvancedModelRenderer(this);
        tentaclea2.setRotationPoint(0.0F, -2.5F, 0.0F);
        tentacles1.addChild(tentaclea2);
        tentacles1.scaleChildren = true;
        tentaclea2.cubeList.add(new ModelBox(tentaclea2, 4, 32, -0.5F, -3.0F, -0.5F, 1, 3, 1, -0.05F, false));
        tentaclea2.cubeList.add(new ModelBox(tentaclea2, 0, 0, -4.0F, -1.0F, 0.0F, 8, 3, 0, 0.0F, false));

        tentaclea3 = new AdvancedModelRenderer(this);
        tentaclea3.setRotationPoint(0.0F, -2.5F, 0.0F);
        tentaclea2.addChild(tentaclea3);
        tentaclea2.scaleChildren = true;
        tentaclea3.cubeList.add(new ModelBox(tentaclea3, 8, 32, -0.5F, -3.0F, -0.5F, 1, 3, 1, -0.1F, false));

        tentaclea4 = new AdvancedModelRenderer(this);
        tentaclea4.setRotationPoint(0.0F, -2.5F, 0.0F);
        tentaclea3.addChild(tentaclea4);
        tentaclea3.scaleChildren = true;
        tentaclea4.cubeList.add(new ModelBox(tentaclea4, 12, 32, -0.5F, -2.0F, -0.5F, 1, 2, 1, -0.15F, false));

        // Duplication for new texture:
        tentacleroot2 = new AdvancedModelRenderer(this);
        tentacleroot2.setRotationPoint(0.0F, 9.0F, -4.0F);


        tentacleb1 = new AdvancedModelRenderer(this);
        tentacleb1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tentacleroot2.addChild(tentacleb1);
        tentacleroot2.scaleChildren = true;
        tentacleb1.cubeList.add(new ModelBox(tentacleb1, 0, 37, -0.5F, -3.0F, -0.5F, 1, 4, 1, 0.0F, false));

        tentacleb2 = new AdvancedModelRenderer(this);
        tentacleb2.setRotationPoint(0.0F, -2.5F, 0.0F);
        tentacleb1.addChild(tentacleb2);
        tentacleb1.scaleChildren = true;
        tentacleb2.cubeList.add(new ModelBox(tentacleb2, 4, 37, -0.5F, -3.0F, -0.5F, 1, 3, 1, -0.05F, false));

        tentacleb3 = new AdvancedModelRenderer(this);
        tentacleb3.setRotationPoint(0.0F, -2.5F, 0.0F);
        tentacleb2.addChild(tentacleb3);
        tentacleb2.scaleChildren = true;
        tentacleb3.cubeList.add(new ModelBox(tentacleb3, 8, 37, -0.5F, -3.0F, -0.5F, 1, 3, 1, -0.1F, false));

        tentacleb4 = new AdvancedModelRenderer(this);
        tentacleb4.setRotationPoint(0.0F, -2.5F, 0.0F);
        tentacleb3.addChild(tentacleb4);
        tentacleb3.scaleChildren = true;

        tentacleb5 = new AdvancedModelRenderer(this);
        tentacleb5.setRotationPoint(0.0F, 0.5F, 0.0F);
        tentacleb4.addChild(tentacleb5);
        setRotateAngle(tentacleb5,-0.576F, 0, 0F);
        tentacleb4.cubeList.add(new ModelBox(tentacleb5, 12, 37, -0.5F, -2.0F, -0.5F, 1, 2, 1, -0.15F, false));

        tentacleb6 = new AdvancedModelRenderer(this);
        tentacleb6.setRotationPoint(0.0F, 0.5F, 0.0F);
        tentacleb4.addChild(tentacleb6);
        setRotateAngle(tentacleb6,0.576F, 0, 0);
        tentacleb6.cubeList.add(new ModelBox(tentacleb6, 12, 37, -0.5F, -2.0F, -0.5F, 1, 2, 1, -0.151F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);
        root.render(f);
    }

    public void renderTentacle(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        this.tentacles1.flap(0.07F, -0.10F * tentacleroot1.scaleX, false, timeOffset, -0.15F * tentacleroot1.scaleX, f2, tentacleroot1.scaleX);
        this.tentaclea2.flap(0.07F, -0.18F * tentacleroot1.scaleX, false, timeOffset + 0.2F, -0.18F * tentacleroot1.scaleX, f2, tentacleroot1.scaleX);
        this.tentaclea3.flap(0.07F, -0.55F * tentacleroot1.scaleX, false, timeOffset + 0.4F, -0.55F * tentacleroot1.scaleX, f2, tentacleroot1.scaleX);
        this.tentaclea4.flap(0.28F, -0.95F * tentacleroot1.scaleX, false, timeOffset + 0.6F, 0, f2, tentacleroot1.scaleX);
        //this.chainFlap(tentacleAll, 0.1F, -0.5F * tentacleroot1.scaleX, -2.5, timeOffset, f2, 1.1F);

        tentacleroot1.rotateAngleY = (float)Math.toRadians(0 + offset);
        tentacleroot1.render(f);
        tentacleroot1.rotateAngleY = (float)Math.toRadians(72 + offset);
        tentacleroot1.render(f);
        tentacleroot1.rotateAngleY = (float)Math.toRadians(144 + offset);
        tentacleroot1.render(f);
        tentacleroot1.rotateAngleY = (float)Math.toRadians(216 + offset);
        tentacleroot1.render(f);
        tentacleroot1.rotateAngleY = (float)Math.toRadians(288 + offset);
        tentacleroot1.render(f);
    }

    public void renderTentacleVar(int animationTick, float f, double partialTicks, int offset, float f2, float timeOffset) {
        resetToDefaultPose();
        animationCycle(animationTick, partialTicks);

        this.tentacleb1.flap(0.07F, -0.10F * tentacleroot2.scaleX, false, timeOffset, -0.15F * tentacleroot2.scaleX, f2, tentacleroot2.scaleX);
        this.tentacleb2.flap(0.07F, -0.18F * tentacleroot2.scaleX, false, timeOffset + 0.2F, -0.18F * tentacleroot2.scaleX, f2, tentacleroot2.scaleX);
        this.tentacleb3.flap(0.07F, -0.55F * tentacleroot2.scaleX, false, timeOffset + 0.4F, -0.55F * tentacleroot2.scaleX, f2, tentacleroot2.scaleX);
        this.tentacleb4.flap(0.28F, -0.95F * tentacleroot2.scaleX, false, timeOffset + 0.6F, 0, f2, tentacleroot2.scaleX);
        //this.chainFlap(tentacleAll, 0.1F, -0.5F * tentacleroot1.scaleX, -2.5, timeOffset, f2, 1.1F);

        tentacleroot2.rotateAngleY = (float)Math.toRadians(0 + offset);
        tentacleroot2.render(f);
        tentacleroot2.rotateAngleY = (float)Math.toRadians(72 + offset);
        tentacleroot2.render(f);
        tentacleroot2.rotateAngleY = (float)Math.toRadians(144 + offset);
        tentacleroot2.render(f);
        tentacleroot2.rotateAngleY = (float)Math.toRadians(216 + offset);
        tentacleroot2.render(f);
        tentacleroot2.rotateAngleY = (float)Math.toRadians(288 + offset);
        tentacleroot2.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    public void animationCycle(double animTick, double partialTickTime) {
        int animCycle = 90 + 1;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.99 + (((tickAnim - 0) / 10) * (1-(0.99)));
            yy = 0.99 + (((tickAnim - 0) / 10) * (1-(0.99)));
            zz = 0.99 + (((tickAnim - 0) / 10) * (1-(0.99)));
        }
        else if (tickAnim >= 10 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 10) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 80) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 80) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (45-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 80) / 10) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacles1, tentacles1.rotateAngleX + (float) Math.toRadians(xx), tentacles1.rotateAngleY + (float) Math.toRadians(yy), tentacles1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (1-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 80) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 80) / 10) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacles1.setScale((float)xx * 0.8F, (float)yy * 0.8F, (float)zz * 0.8F);
        this.tentacleb1.setScale((float)xx * 0.75F, (float)yy * 0.75F, (float)zz * 0.75F);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (20-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 20 + (((tickAnim - 26) / 12) * (0-(20)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 11) * (20-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 49) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 13) * (0-(0)));
            zz = 20 + (((tickAnim - 49) / 13) * (0-(20)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 18) * (17.5-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 17.5 + (((tickAnim - 80) / 10) * (17.5-(17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentaclea3, tentaclea3.rotateAngleX + (float) Math.toRadians(xx), tentaclea3.rotateAngleY + (float) Math.toRadians(yy), tentaclea3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (20-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 20 + (((tickAnim - 20) / 13) * (0-(20)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (20-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 43) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 13) * (0-(0)));
            zz = 20 + (((tickAnim - 43) / 13) * (0-(20)));
        }
        else if (tickAnim >= 56 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 56) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 24) * (40-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 40 + (((tickAnim - 80) / 10) * (40-(40)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentaclea2, tentaclea2.rotateAngleX + (float) Math.toRadians(xx), tentaclea2.rotateAngleY + (float) Math.toRadians(yy), tentaclea2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (14.36-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 14.36 + (((tickAnim - 23) / 10) * (-10-(14.36)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = -10 + (((tickAnim - 33) / 12) * (0-(-10)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (20-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            zz = 20 + (((tickAnim - 56) / 12) * (-15-(20)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = -15 + (((tickAnim - 68) / 12) * (-15-(-15)));
        }
        else if (tickAnim >= 80 && tickAnim < 90 + 1) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = -15 + (((tickAnim - 80) / 10) * (-15-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentaclea4, tentaclea4.rotateAngleX + (float) Math.toRadians(xx), tentaclea4.rotateAngleY + (float) Math.toRadians(yy), tentaclea4.rotateAngleZ + (float) Math.toRadians(zz));


    }

}
