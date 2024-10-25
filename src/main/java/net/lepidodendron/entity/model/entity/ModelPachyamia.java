package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCalamopleurus;
import net.lepidodendron.entity.EntityPrehistoricFloraPachyamia;
import net.lepidodendron.entity.EntityPrehistoricFloraVidalamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPachyamia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodyfrontslope;
    private final AdvancedModelRenderer bodymiddlefront;
    private final AdvancedModelRenderer bodymiddleend;
    private final AdvancedModelRenderer bellyslope;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer dorsalfinpt8;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer dorsalslope;
    private final AdvancedModelRenderer dorsalfinpt7;
    private final AdvancedModelRenderer dorsalfinpt5;
    private final AdvancedModelRenderer dorsalfinpt6;
    private final AdvancedModelRenderer dorsalfinpt4;
    private final AdvancedModelRenderer dorsalfinpt3;
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
    private final AdvancedModelRenderer jawinnerpiece;
    private final AdvancedModelRenderer gillunderside;
    private final AdvancedModelRenderer lowerjawbase;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer leftjawflesh;
    private final AdvancedModelRenderer rightjawflesh;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer rightpectoralfin;

    private ModelAnimator animator;

    public ModelPachyamia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 1.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 18.0F, -2.0F);
        this.root.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.1061F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 19, 32, -2.5F, -2.0F, -5.0F, 5, 4, 6, 0.0F, true));

        this.bodyfrontslope = new AdvancedModelRenderer(this);
        this.bodyfrontslope.setRotationPoint(0.01F, 1.95F, 1.0F);
        this.bodyfront.addChild(bodyfrontslope);
        this.setRotateAngle(bodyfrontslope, -0.2759F, 0.0F, 0.0F);
        this.bodyfrontslope.cubeList.add(new ModelBox(bodyfrontslope, 0, 8, -2.5F, 0.0F, -6.0F, 5, 3, 6, 0.0F, true));

        this.bodymiddlefront = new AdvancedModelRenderer(this);
        this.bodymiddlefront.setRotationPoint(-0.01F, 0.35F, 0.1F);
        this.bodyfront.addChild(bodymiddlefront);
        this.setRotateAngle(bodymiddlefront, -0.1061F, 0.0F, 0.0F);
        this.bodymiddlefront.cubeList.add(new ModelBox(bodymiddlefront, 0, 18, -2.5F, -2.5F, 0.0F, 5, 7, 7, 0.0F, true));

        this.bodymiddleend = new AdvancedModelRenderer(this);
        this.bodymiddleend.setRotationPoint(0.01F, -0.45F, 6.2F);
        this.bodymiddlefront.addChild(bodymiddleend);
        this.setRotateAngle(bodymiddleend, -0.0213F, 0.0F, 0.0F);
        this.bodymiddleend.cubeList.add(new ModelBox(bodymiddleend, 18, 13, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F, true));

        this.bellyslope = new AdvancedModelRenderer(this);
        this.bellyslope.setRotationPoint(0.01F, 1.9F, 0.0F);
        this.bodymiddleend.addChild(bellyslope);
        this.setRotateAngle(bellyslope, 0.1061F, 0.0F, 0.0F);
        this.bellyslope.cubeList.add(new ModelBox(bellyslope, 17, 3, -2.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.9F, 3.0F, 0.5F);
        this.bellyslope.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, 0.7854F, 0.0F, 0.4882F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 33, 4, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.9F, 3.0F, 0.5F);
        this.bellyslope.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, 0.7854F, 0.0F, -0.4882F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 33, 0, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(-0.01F, 1.1F, 5.0F);
        this.bodymiddleend.addChild(bodyend);
        this.setRotateAngle(bodyend, 0.1485F, 0.0F, 0.0F);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 42, 33, -1.5F, -1.0F, 0.0F, 3, 4, 5, 0.0F, true));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.bodyend.addChild(tailbase);
        this.setRotateAngle(tailbase, -0.0637F, 0.0F, 0.0F);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 0, 43, -1.0F, -2.0F, 0.0F, 2, 5, 3, 0.0F, true));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tailbase.addChild(tailend);
        this.setRotateAngle(tailend, 0.1274F, 0.0F, 0.0F);
        this.tailend.cubeList.add(new ModelBox(tailend, 11, 43, -0.5F, -2.0F, 0.0F, 1, 5, 3, 0.0F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -0.7F, 1.5F);
        this.tailend.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.1274F, 0.0F, 0.0F);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 24, 0.0F, -3.6F, 0.0F, 0, 9, 9, 0.0F, true));

        this.dorsalfinpt8 = new AdvancedModelRenderer(this);
        this.dorsalfinpt8.setRotationPoint(0.01F, -1.7F, 0.2F);
        this.tailbase.addChild(dorsalfinpt8);
        this.setRotateAngle(dorsalfinpt8, -0.1274F, 0.0F, 0.0F);
        this.dorsalfinpt8.cubeList.add(new ModelBox(dorsalfinpt8, 56, 23, 0.0F, -3.0F, 0.0F, 0, 3, 4, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 3.0F, 1.8F);
        this.bodyend.addChild(analfin);
        this.setRotateAngle(analfin, 0.3396F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 38, 0, 0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F, true));

        this.dorsalslope = new AdvancedModelRenderer(this);
        this.dorsalslope.setRotationPoint(-0.01F, -2.0F, 0.1F);
        this.bodyend.addChild(dorsalslope);
        this.setRotateAngle(dorsalslope, -0.1911F, 0.0F, 0.0F);
        this.dorsalslope.cubeList.add(new ModelBox(dorsalslope, 20, 44, -1.5F, -1.0F, 0.0F, 3, 2, 5, 0.0F, true));

        this.dorsalfinpt7 = new AdvancedModelRenderer(this);
        this.dorsalfinpt7.setRotationPoint(0.0F, -1.0F, 3.6F);
        this.dorsalslope.addChild(dorsalfinpt7);
        this.setRotateAngle(dorsalfinpt7, 0.0213F, 0.0F, 0.0F);
        this.dorsalfinpt7.cubeList.add(new ModelBox(dorsalfinpt7, 40, 4, 0.0F, -2.6F, 0.0F, 0, 3, 2, 0.0F, true));

        this.dorsalfinpt5 = new AdvancedModelRenderer(this);
        this.dorsalfinpt5.setRotationPoint(0.0F, -1.0F, 0.5F);
        this.dorsalslope.addChild(dorsalfinpt5);
        this.setRotateAngle(dorsalfinpt5, 0.0424F, 0.0F, 0.0F);
        this.dorsalfinpt5.cubeList.add(new ModelBox(dorsalfinpt5, 45, 0, 0.0F, -2.6F, 0.0F, 0, 3, 2, 0.0F, true));

        this.dorsalfinpt6 = new AdvancedModelRenderer(this);
        this.dorsalfinpt6.setRotationPoint(-0.01F, -1.0F, 1.9F);
        this.dorsalslope.addChild(dorsalfinpt6);
        this.setRotateAngle(dorsalfinpt6, 0.0213F, 0.0F, 0.0F);
        this.dorsalfinpt6.cubeList.add(new ModelBox(dorsalfinpt6, 45, 4, 0.0F, -2.6F, 0.0F, 0, 3, 2, 0.0F, true));

        this.dorsalfinpt4 = new AdvancedModelRenderer(this);
        this.dorsalfinpt4.setRotationPoint(0.01F, -1.5F, 3.2F);
        this.bodymiddleend.addChild(dorsalfinpt4);
        this.setRotateAngle(dorsalfinpt4, -0.0213F, 0.0F, 0.0F);
        this.dorsalfinpt4.cubeList.add(new ModelBox(dorsalfinpt4, 50, 0, 0.0F, -3.1F, 0.0F, 0, 3, 3, 0.0F, true));

        this.dorsalfinpt3 = new AdvancedModelRenderer(this);
        this.dorsalfinpt3.setRotationPoint(0.0F, -2.0F, 0.7F);
        this.bodymiddleend.addChild(dorsalfinpt3);
        this.setRotateAngle(dorsalfinpt3, -0.0213F, 0.0F, 0.0F);
        this.dorsalfinpt3.cubeList.add(new ModelBox(dorsalfinpt3, 50, 4, 0.0F, -2.6F, 0.0F, 0, 3, 3, 0.0F, true));

        this.dorsalfinpt1 = new AdvancedModelRenderer(this);
        this.dorsalfinpt1.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.bodymiddlefront.addChild(dorsalfinpt1);
        this.setRotateAngle(dorsalfinpt1, -0.0848F, 0.0F, 0.0F);
        this.dorsalfinpt1.cubeList.add(new ModelBox(dorsalfinpt1, 56, 10, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, true));

        this.dorsalfinpt2 = new AdvancedModelRenderer(this);
        this.dorsalfinpt2.setRotationPoint(-0.01F, -2.0F, 5.3F);
        this.bodymiddlefront.addChild(dorsalfinpt2);
        this.setRotateAngle(dorsalfinpt2, -0.0848F, 0.0F, 0.0F);
        this.dorsalfinpt2.cubeList.add(new ModelBox(dorsalfinpt2, 50, 9, 0.0F, -3.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -4.9F);
        this.bodyfront.addChild(head);
        this.setRotateAngle(head, 0.0213F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 42, 18, -3.0F, -1.0F, -4.0F, 6, 3, 5, 0.0F, true));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.0F, -1.0F, -3.7F);
        this.head.addChild(eyeportion);
        this.setRotateAngle(eyeportion, 0.0848F, 0.0F, 0.0F);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 32, 43, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, 0.2972F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 33, 25, -1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, true));

        this.snoutfront = new AdvancedModelRenderer(this);
        this.snoutfront.setRotationPoint(-0.01F, 0.0F, -1.0F);
        this.snout.addChild(snoutfront);
        this.setRotateAngle(snoutfront, 0.7854F, 0.0F, 0.0F);
        this.snoutfront.cubeList.add(new ModelBox(snoutfront, 26, 52, -1.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F, true));

        this.leftbarbel = new AdvancedModelRenderer(this);
        this.leftbarbel.setRotationPoint(-0.7F, 0.2F, -0.1F);
        this.snoutfront.addChild(leftbarbel);
        this.setRotateAngle(leftbarbel, 0.3183F, 0.0848F, -0.1274F);
        this.leftbarbel.cubeList.add(new ModelBox(leftbarbel, 10, 0, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.rightbarbel = new AdvancedModelRenderer(this);
        this.rightbarbel.setRotationPoint(0.7F, 0.2F, -0.1F);
        this.snoutfront.addChild(rightbarbel);
        this.setRotateAngle(rightbarbel, 0.3183F, -0.0848F, 0.1274F);
        this.rightbarbel.cubeList.add(new ModelBox(rightbarbel, 13, 0, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.leftupperlipfront = new AdvancedModelRenderer(this);
        this.leftupperlipfront.setRotationPoint(-0.56F, 0.6F, -1.0F);
        this.snout.addChild(leftupperlipfront);
        this.setRotateAngle(leftupperlipfront, -1.0613F, -0.3821F, 0.3609F);
        this.leftupperlipfront.cubeList.add(new ModelBox(leftupperlipfront, 14, 0, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.rightupperlipfront = new AdvancedModelRenderer(this);
        this.rightupperlipfront.setRotationPoint(0.58F, 0.6F, -1.0F);
        this.snout.addChild(rightupperlipfront);
        this.setRotateAngle(rightupperlipfront, -1.0613F, 0.3821F, -0.3609F);
        this.rightupperlipfront.cubeList.add(new ModelBox(rightupperlipfront, 8, 2, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.leftupperlip = new AdvancedModelRenderer(this);
        this.leftupperlip.setRotationPoint(-1.38F, 1.59F, -3.05F);
        this.eyeportion.addChild(leftupperlip);
        this.setRotateAngle(leftupperlip, -0.3609F, -0.2335F, -0.1698F);
        this.leftupperlip.cubeList.add(new ModelBox(leftupperlip, 2, 3, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.rightupperlip = new AdvancedModelRenderer(this);
        this.rightupperlip.setRotationPoint(1.38F, 1.59F, -3.05F);
        this.eyeportion.addChild(rightupperlip);
        this.setRotateAngle(rightupperlip, -0.3609F, 0.2335F, 0.1698F);
        this.rightupperlip.cubeList.add(new ModelBox(rightupperlip, 12, 4, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.15F, 1.0F, -2.49F);
        this.eyeportion.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.2759F, -0.2335F, 0.0848F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 5, 0, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.15F, 1.0F, -2.49F);
        this.eyeportion.addChild(righteye);
        this.setRotateAngle(righteye, -0.2759F, 0.2335F, -0.0848F);
        this.righteye.cubeList.add(new ModelBox(righteye, 0, 1, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jawinnerpiece = new AdvancedModelRenderer(this);
        this.jawinnerpiece.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.eyeportion.addChild(jawinnerpiece);
        this.jawinnerpiece.cubeList.add(new ModelBox(jawinnerpiece, 21, 0, -2.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.gillunderside = new AdvancedModelRenderer(this);
        this.gillunderside.setRotationPoint(-0.01F, 3.9F, 0.6F);
        this.head.addChild(gillunderside);
        this.setRotateAngle(gillunderside, -0.1911F, 0.0F, 0.0F);
        this.gillunderside.cubeList.add(new ModelBox(gillunderside, 33, 10, -3.0F, -2.0F, -5.0F, 6, 2, 5, 0.0F, true));

        this.lowerjawbase = new AdvancedModelRenderer(this);
        this.lowerjawbase.setRotationPoint(0.01F, 2.35F, -3.55F);
        this.head.addChild(lowerjawbase);
        this.setRotateAngle(lowerjawbase, -0.2759F, 0.0F, 0.0F);
        this.lowerjawbase.cubeList.add(new ModelBox(lowerjawbase, 0, 52, -2.0F, -0.3F, -3.0F, 4, 1, 3, 0.0F, true));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, 0.7F, -3.0F);
        this.lowerjawbase.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.3183F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 15, 53, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, true));

        this.leftjawflesh = new AdvancedModelRenderer(this);
        this.leftjawflesh.setRotationPoint(-2.0F, -0.3F, -2.1F);
        this.lowerjawbase.addChild(leftjawflesh);
        this.setRotateAngle(leftjawflesh, -0.4033F, 0.0848F, 0.1698F);
        this.leftjawflesh.cubeList.add(new ModelBox(leftjawflesh, 0, 9, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.rightjawflesh = new AdvancedModelRenderer(this);
        this.rightjawflesh.setRotationPoint(2.0F, -0.3F, -2.1F);
        this.lowerjawbase.addChild(rightjawflesh);
        this.setRotateAngle(rightjawflesh, -0.4033F, -0.1274F, -0.1698F);
        this.rightjawflesh.cubeList.add(new ModelBox(rightjawflesh, 0, 6, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-2.45F, 3.1F, -4.0F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, -0.5519F, -0.3183F, 0.1911F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 56, 4, 0.0F, -2.0F, 0.0F, 0, 3, 4, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(2.45F, 3.1F, -4.0F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, -0.5519F, 0.3183F, -0.1911F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 56, 0, 0.0F, -2.0F, 0.0F, 0, 3, 4, 0.0F, true));

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
//        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.bodymiddleend, this.bodyend, this.tailbase, this.tailend, this.tailfin};
        AdvancedModelRenderer[] dorsal = {this.dorsalfinpt1, this.dorsalfinpt2, this.dorsalfinpt3, this.dorsalfinpt4, this.dorsalfinpt5, this.dorsalfinpt6, this.dorsalfinpt7, this.dorsalfinpt8};
        ((EntityPrehistoricFloraPachyamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.23F;
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
            this.chainFlap(dorsal, speed * still, 0.35F * still, -4, f2, 1F);
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.01F, true, 0, 0, f2, 0.5F);
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

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPachyamia ee = (EntityPrehistoricFloraPachyamia) entitylivingbaseIn;

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPachyamia entity = (EntityPrehistoricFloraPachyamia) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 3) / 2) * (0.04581-(3)));
            yy = 1.75 + (((tickAnim - 3) / 2) * (0.8117-(1.75)));
            zz = 0 + (((tickAnim - 3) / 2) * (2.00012-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.04581 + (((tickAnim - 5) / 5) * (0-(0.04581)));
            yy = 0.8117 + (((tickAnim - 5) / 5) * (0-(0.8117)));
            zz = 2.00012 + (((tickAnim - 5) / 5) * (0-(2.00012)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = -0.675 + (((tickAnim - 3) / 7) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bodyfront.rotationPointX = this.bodyfront.rotationPointX + (float)(xx);
        this.bodyfront.rotationPointY = this.bodyfront.rotationPointY - (float)(yy);
        this.bodyfront.rotationPointZ = this.bodyfront.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -4 + (((tickAnim - 3) / 2) * (3.75-(-4)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 3.75 + (((tickAnim - 5) / 5) * (0-(3.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddlefront, bodymiddlefront.rotateAngleX + (float) Math.toRadians(xx), bodymiddlefront.rotateAngleY + (float) Math.toRadians(yy), bodymiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -5.75 + (((tickAnim - 2) / 1) * (-6.81-(-5.75)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -6.81 + (((tickAnim - 3) / 2) * (5.52-(-6.81)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 5.52 + (((tickAnim - 5) / 2) * (6.85-(5.52)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 6.85 + (((tickAnim - 7) / 3) * (0-(6.85)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddleend, bodymiddleend.rotateAngleX + (float) Math.toRadians(xx), bodymiddleend.rotateAngleY + (float) Math.toRadians(yy), bodymiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -6 + (((tickAnim - 2) / 1) * (-8.37-(-6)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -8.37 + (((tickAnim - 3) / 0) * (-9.25-(-8.37)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -9.25 + (((tickAnim - 3) / 2) * (-10.56-(-9.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -10.56 + (((tickAnim - 5) / 2) * (7.12-(-10.56)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 7.12 + (((tickAnim - 7) / 3) * (0-(7.12)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyend, bodyend.rotateAngleX + (float) Math.toRadians(xx), bodyend.rotateAngleY + (float) Math.toRadians(yy), bodyend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 11.5 + (((tickAnim - 2) / 1) * (-3.87-(11.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -3.87 + (((tickAnim - 3) / 2) * (-7.77-(-3.87)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -7.77 + (((tickAnim - 5) / 2) * (8.82-(-7.77)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 8.82 + (((tickAnim - 7) / 3) * (0-(8.82)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (16.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 16.25 + (((tickAnim - 2) / 1) * (-9.31-(16.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -9.31 + (((tickAnim - 3) / 2) * (-7.73-(-9.31)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -7.73 + (((tickAnim - 5) / 2) * (10.84-(-7.73)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 10.84 + (((tickAnim - 7) / 3) * (0-(10.84)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(xx), tailend.rotateAngleY + (float) Math.toRadians(yy), tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.75 + (((tickAnim - 3) / 2) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperlipfront, leftupperlipfront.rotateAngleX + (float) Math.toRadians(xx), leftupperlipfront.rotateAngleY + (float) Math.toRadians(yy), leftupperlipfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.75 + (((tickAnim - 3) / 2) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperlipfront, rightupperlipfront.rotateAngleX + (float) Math.toRadians(xx), rightupperlipfront.rotateAngleY + (float) Math.toRadians(yy), rightupperlipfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.75 + (((tickAnim - 3) / 2) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperlip, leftupperlip.rotateAngleX + (float) Math.toRadians(xx), leftupperlip.rotateAngleY + (float) Math.toRadians(yy), leftupperlip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.75 + (((tickAnim - 3) / 2) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperlip, rightupperlip.rotateAngleX + (float) Math.toRadians(xx), rightupperlip.rotateAngleY + (float) Math.toRadians(yy), rightupperlip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (41.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 41.75 + (((tickAnim - 3) / 2) * (0-(41.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
//        this.resetToDefaultPose();
//        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

//        animator.setAnimation(e.ATTACK_ANIMATION);
//        animator.startKeyframe(8);
//        animator.rotate(this.lowerjawbase, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(5);
//        animator.resetKeyframe(2);

    }
}

