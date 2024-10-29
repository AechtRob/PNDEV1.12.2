package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSinamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSinamia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodyfrontslope;
    private final AdvancedModelRenderer bodymiddlefront;
    private final AdvancedModelRenderer bodymiddleend;
    private final AdvancedModelRenderer bellyslope;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer dorsalslope;
    private final AdvancedModelRenderer dorsalfinpt6;
    private final AdvancedModelRenderer dorsalfinpt7;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalfinpt3;
    private final AdvancedModelRenderer dorsalfinpt4;
    private final AdvancedModelRenderer dorsalfinpt5;
    private final AdvancedModelRenderer dorsalfinpt1;
    private final AdvancedModelRenderer dorsalfinpt2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer eyeportion;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer snoutfront;
    private final AdvancedModelRenderer leftbarbel;
    private final AdvancedModelRenderer rightbarbel;
    private final AdvancedModelRenderer leftupperlipfront;
    private final AdvancedModelRenderer rightupperlipfront;
    private final AdvancedModelRenderer leftupperlip;
    private final AdvancedModelRenderer rightupperlip;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer gillunderside;
    private final AdvancedModelRenderer lowerjawbase;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer leftjawflesh;
    private final AdvancedModelRenderer rightjawflesh;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer rightpectoralfin;

    private ModelAnimator animator;

    public ModelSinamia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 2.0F, 2.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 18.0F, -2.0F);
        this.root.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0637F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 19, 23, -2.0F, -1.5F, -5.0F, 4, 4, 5, 0.0F, false));

        this.bodyfrontslope = new AdvancedModelRenderer(this);
        this.bodyfrontslope.setRotationPoint(-0.01F, 2.5F, 0.0F);
        this.bodyfront.addChild(bodyfrontslope);
        this.setRotateAngle(bodyfrontslope, -0.1698F, 0.0F, 0.0F);
        this.bodyfrontslope.cubeList.add(new ModelBox(bodyfrontslope, 0, 8, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.bodymiddlefront = new AdvancedModelRenderer(this);
        this.bodymiddlefront.setRotationPoint(0.01F, 0.5F, -0.7F);
        this.bodyfront.addChild(bodymiddlefront);
        this.setRotateAngle(bodymiddlefront, -0.1061F, 0.0F, 0.0F);
        this.bodymiddlefront.cubeList.add(new ModelBox(bodymiddlefront, 0, 15, -2.0F, -2.0F, 0.0F, 4, 5, 5, 0.0F, false));

        this.bodymiddleend = new AdvancedModelRenderer(this);
        this.bodymiddleend.setRotationPoint(-0.01F, -0.5F, 4.2F);
        this.bodymiddlefront.addChild(bodymiddleend);
        this.setRotateAngle(bodymiddleend, -0.1061F, 0.0F, 0.0F);
        this.bodymiddleend.cubeList.add(new ModelBox(bodymiddleend, 19, 13, -2.0F, -1.5F, 0.0F, 4, 4, 5, 0.0F, false));

        this.bellyslope = new AdvancedModelRenderer(this);
        this.bellyslope.setRotationPoint(-0.01F, 2.5F, 0.0F);
        this.bodymiddleend.addChild(bellyslope);
        this.setRotateAngle(bellyslope, 0.1911F, 0.0F, 0.0F);
        this.bellyslope.cubeList.add(new ModelBox(bellyslope, 14, 6, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(0.9F, 1.0F, 1.0F);
        this.bellyslope.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, 0.8915F, 0.0F, -0.4882F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 31, 0, 0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F, false));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(-0.9F, 1.0F, 1.0F);
        this.bellyslope.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, 0.8915F, 0.0F, 0.4882F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 34, 0, 0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F, false));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.5F, 4.1F);
        this.bodymiddleend.addChild(bodyend);
        this.setRotateAngle(bodyend, 0.1911F, 0.0F, 0.0F);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 38, 25, -1.5F, -1.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.dorsalslope = new AdvancedModelRenderer(this);
        this.dorsalslope.setRotationPoint(0.01F, -1.0F, -0.2F);
        this.bodyend.addChild(dorsalslope);
        this.setRotateAngle(dorsalslope, -0.2546F, 0.0F, 0.0F);
        this.dorsalslope.cubeList.add(new ModelBox(dorsalslope, 20, 33, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.dorsalfinpt6 = new AdvancedModelRenderer(this);
        this.dorsalfinpt6.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.dorsalslope.addChild(dorsalfinpt6);
        this.setRotateAngle(dorsalfinpt6, -0.1061F, 0.0F, 0.0F);
        this.dorsalfinpt6.cubeList.add(new ModelBox(dorsalfinpt6, 42, 5, 0.0F, -1.8F, 0.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfinpt7 = new AdvancedModelRenderer(this);
        this.dorsalfinpt7.setRotationPoint(-0.01F, -1.0F, 2.5F);
        this.dorsalslope.addChild(dorsalfinpt7);
        this.setRotateAngle(dorsalfinpt7, -0.1911F, 0.0F, 0.0F);
        this.dorsalfinpt7.cubeList.add(new ModelBox(dorsalfinpt7, 37, 5, 0.0F, -1.6F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.bodyend.addChild(tailbase);
        this.setRotateAngle(tailbase, -0.0424F, 0.0F, 0.0F);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 0, 33, -1.0F, -1.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tailbase.addChild(tailend);
        this.setRotateAngle(tailend, 0.1485F, 0.0F, 0.0F);
        this.tailend.cubeList.add(new ModelBox(tailend, 11, 33, -0.5F, -1.0F, 0.0F, 1, 3, 3, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tailend.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.1485F, 0.0F, 0.0F);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 17, 0.0F, -3.0F, 0.0F, 0, 6, 9, 0.0F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 2.0F, 1.4F);
        this.bodyend.addChild(analfin);
        this.setRotateAngle(analfin, 0.8915F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 37, 0, 0.0F, 0.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.dorsalfinpt3 = new AdvancedModelRenderer(this);
        this.dorsalfinpt3.setRotationPoint(0.0F, -1.5F, 0.4F);
        this.bodymiddleend.addChild(dorsalfinpt3);
        this.setRotateAngle(dorsalfinpt3, -0.0213F, 0.0F, 0.0F);
        this.dorsalfinpt3.cubeList.add(new ModelBox(dorsalfinpt3, 47, 3, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfinpt4 = new AdvancedModelRenderer(this);
        this.dorsalfinpt4.setRotationPoint(0.01F, -1.5F, 1.9F);
        this.bodymiddleend.addChild(dorsalfinpt4);
        this.setRotateAngle(dorsalfinpt4, -0.0213F, 0.0F, 0.0F);
        this.dorsalfinpt4.cubeList.add(new ModelBox(dorsalfinpt4, 46, 0, 0.0F, -1.9F, 0.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfinpt5 = new AdvancedModelRenderer(this);
        this.dorsalfinpt5.setRotationPoint(0.0F, -1.5F, 3.4F);
        this.bodymiddleend.addChild(dorsalfinpt5);
        this.setRotateAngle(dorsalfinpt5, -0.0637F, 0.0F, 0.0F);
        this.dorsalfinpt5.cubeList.add(new ModelBox(dorsalfinpt5, 42, 2, 0.0F, -1.8F, 0.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfinpt1 = new AdvancedModelRenderer(this);
        this.dorsalfinpt1.setRotationPoint(0.0F, -2.0F, 1.8F);
        this.bodymiddlefront.addChild(dorsalfinpt1);
        this.setRotateAngle(dorsalfinpt1, -0.0848F, 0.0F, 0.0F);
        this.dorsalfinpt1.cubeList.add(new ModelBox(dorsalfinpt1, 47, 9, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfinpt2 = new AdvancedModelRenderer(this);
        this.dorsalfinpt2.setRotationPoint(0.01F, -2.0F, 3.3F);
        this.bodymiddlefront.addChild(dorsalfinpt2);
        this.setRotateAngle(dorsalfinpt2, -0.1061F, 0.0F, 0.0F);
        this.dorsalfinpt2.cubeList.add(new ModelBox(dorsalfinpt2, 47, 6, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4F, -4.9F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, 0.1061F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 38, 17, -2.5F, -1.0F, -3.5F, 5, 3, 4, 0.0F, false));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.head.addChild(eyeportion);
        this.setRotateAngle(eyeportion, 0.1485F, 0.0F, 0.0F);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 35, 33, -2.0F, 0.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, 0.1911F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 33, 25, -1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.snoutfront = new AdvancedModelRenderer(this);
        this.snoutfront.setRotationPoint(0.01F, 0.0F, -1.0F);
        this.snout.addChild(snoutfront);
        this.setRotateAngle(snoutfront, 0.8915F, 0.0F, 0.0F);
        this.snoutfront.cubeList.add(new ModelBox(snoutfront, 24, 39, -1.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F, false));

        this.leftbarbel = new AdvancedModelRenderer(this);
        this.leftbarbel.setRotationPoint(0.85F, 0.2F, -0.1F);
        this.snoutfront.addChild(leftbarbel);
        this.setRotateAngle(leftbarbel, 0.3183F, -0.0848F, 0.1274F);
        this.leftbarbel.cubeList.add(new ModelBox(leftbarbel, 10, 0, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.rightbarbel = new AdvancedModelRenderer(this);
        this.rightbarbel.setRotationPoint(-0.85F, 0.2F, -0.1F);
        this.snoutfront.addChild(rightbarbel);
        this.setRotateAngle(rightbarbel, 0.3183F, 0.0848F, -0.1274F);
        this.rightbarbel.cubeList.add(new ModelBox(rightbarbel, 13, 0, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.leftupperlipfront = new AdvancedModelRenderer(this);
        this.leftupperlipfront.setRotationPoint(0.55F, 0.6F, -1.0F);
        this.snout.addChild(leftupperlipfront);
        this.setRotateAngle(leftupperlipfront, -0.7854F, 0.2759F, -0.2122F);
        this.leftupperlipfront.cubeList.add(new ModelBox(leftupperlipfront, 14, 1, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightupperlipfront = new AdvancedModelRenderer(this);
        this.rightupperlipfront.setRotationPoint(-0.55F, 0.6F, -1.0F);
        this.snout.addChild(rightupperlipfront);
        this.setRotateAngle(rightupperlipfront, -0.7854F, -0.2759F, 0.2122F);
        this.rightupperlipfront.cubeList.add(new ModelBox(rightupperlipfront, 8, 2, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftupperlip = new AdvancedModelRenderer(this);
        this.leftupperlip.setRotationPoint(1.13F, 1.64F, -1.6F);
        this.eyeportion.addChild(leftupperlip);
        this.setRotateAngle(leftupperlip, -0.4882F, 0.1061F, -0.0637F);
        this.leftupperlip.cubeList.add(new ModelBox(leftupperlip, 2, 3, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightupperlip = new AdvancedModelRenderer(this);
        this.rightupperlip.setRotationPoint(-1.13F, 1.64F, -1.6F);
        this.eyeportion.addChild(rightupperlip);
        this.setRotateAngle(rightupperlip, -0.4882F, -0.1061F, 0.0637F);
        this.rightupperlip.cubeList.add(new ModelBox(rightupperlip, 12, 5, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(1.12F, 0.7F, -1.2F);
        this.eyeportion.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.2759F, 0.1698F, -0.0848F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 5, 0, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-1.12F, 0.7F, -1.2F);
        this.eyeportion.addChild(righteye);
        this.setRotateAngle(righteye, -0.2759F, -0.1698F, 0.0848F);
        this.righteye.cubeList.add(new ModelBox(righteye, 0, 1, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.gillunderside = new AdvancedModelRenderer(this);
        this.gillunderside.setRotationPoint(0.01F, 3.1F, 0.3F);
        this.head.addChild(gillunderside);
        this.setRotateAngle(gillunderside, -0.1698F, 0.0F, 0.0F);
        this.gillunderside.cubeList.add(new ModelBox(gillunderside, 33, 10, -2.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.lowerjawbase = new AdvancedModelRenderer(this);
        this.lowerjawbase.setRotationPoint(-0.01F, 1.75F, -3.15F);
        this.head.addChild(lowerjawbase);
        this.setRotateAngle(lowerjawbase, -0.2759F, 0.0F, 0.0F);
        this.lowerjawbase.cubeList.add(new ModelBox(lowerjawbase, 0, 40, -2.0F, -0.3F, -2.0F, 4, 1, 2, 0.0F, false));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, 0.7F, -1.9F);
        this.lowerjawbase.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.2335F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 13, 40, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.leftjawflesh = new AdvancedModelRenderer(this);
        this.leftjawflesh.setRotationPoint(2.0F, -0.3F, -1.6F);
        this.lowerjawbase.addChild(leftjawflesh);
        this.setRotateAngle(leftjawflesh, -0.4033F, -0.1274F, -0.1698F);
        this.leftjawflesh.cubeList.add(new ModelBox(leftjawflesh, 0, 8, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.rightjawflesh = new AdvancedModelRenderer(this);
        this.rightjawflesh.setRotationPoint(-2.0F, -0.3F, -1.6F);
        this.lowerjawbase.addChild(rightjawflesh);
        this.setRotateAngle(rightjawflesh, -0.4033F, 0.1274F, 0.0F);
        this.rightjawflesh.cubeList.add(new ModelBox(rightjawflesh, 0, 5, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(1.95F, 2.1F, -4.8F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, -0.5519F, 0.3183F, -0.1911F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 28, 4, 0.0F, -1.5F, 0.0F, 0, 2, 4, 0.0F, false));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(-1.95F, 2.1F, -4.8F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, -0.5519F, -0.3183F, 0.1911F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 28, 1, 0.0F, -1.5F, 0.0F, 0, 2, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetX = -0.14F;
        this.root.offsetY = -0.19F;
        this.root.offsetZ = 0.06F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.18F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.bodymiddleend, this.bodyend, this.tailbase, this.tailend, this.tailfin};
        AdvancedModelRenderer[] dorsal = {this.dorsalfinpt1, this.dorsalfinpt2, this.dorsalfinpt3, this.dorsalfinpt4, this.dorsalfinpt5, this.dorsalfinpt6, this.dorsalfinpt7};
        ((EntityPrehistoricFloraSinamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.25F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.15F * still, -0.85, f2, 0.5F * still);
            this.chainFlap(dorsal, speed * still, 0.3F * still, -3.5, f2, 1F);
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }
        this.flap(rightpectoralfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightpectoralfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(leftpectoralfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftpectoralfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(rightpelvicfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rightpelvicfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(leftpectoralfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(leftpectoralfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 1.3F;
            this.root.offsetX = 1.1F;
            this.bob(root, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.lowerjawbase, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

